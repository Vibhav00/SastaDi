package util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class ReflectionInitializerCons {
    public static <T> T createInstance(Class<T> clazz) {
        try {
            // Find the constructor
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                Parameter[] parameters = constructor.getParameters();
                Object[] args = new Object[parameters.length];

                for (int i = 0; i < parameters.length; i++) {
                    if (parameters[i].isAnnotationPresent(SastaConstructorInjection.class)) {
                        if (parameters[i].getType() == int.class) {
                            args[i] = 143; // Inject integer value
                        } else if (parameters[i].getType() == String.class) {
                            args[i] = "143"; // Inject string value
                        } else {
                            args[i] = null; // Default value if not handled
                        }
                    } else {
                        args[i] = null; // Default value for non-annotated parameters
                    }
                }

                constructor.setAccessible(true);
                return (T) constructor.newInstance(args);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + clazz.getName(), e);
        }
        throw new RuntimeException("No valid constructor found for " + clazz.getName());
    }
}
