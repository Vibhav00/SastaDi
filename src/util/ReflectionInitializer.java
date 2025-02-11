package util;

import java.lang.reflect.Field;

public class ReflectionInitializer {
    public static void initialize(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(SastaInjection.class)) {
                field.setAccessible(true);  // Allow modification of private fields

                try {
                    if (field.getType() == int.class) {
                        field.set(obj, 143);  // Set integer value
                    } else if (field.getType() == String.class) {
                        field.set(obj, "143");  // Set string value
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Failed to set value for field: " + field.getName(), e);
                }
            }
        }
    }
}
