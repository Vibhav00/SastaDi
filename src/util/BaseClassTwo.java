package util;


// Superclass that creates instances dynamically
public abstract class BaseClassTwo {
    public static <T extends BaseClassTwo> T create(Class<T> clazz) {
        return ReflectionInitializerCons.createInstance(clazz);
    }
}