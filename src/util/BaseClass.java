package util;

// Superclass that all models extend
public abstract class BaseClass {
    public BaseClass() {
        ReflectionInitializer.initialize(this); // Runs automatically!
    }
}