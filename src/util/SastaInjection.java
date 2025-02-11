package util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the custom annotation
@Target(ElementType.FIELD)  // Apply the annotation to fields
@Retention(RetentionPolicy.RUNTIME)  // Retain at runtime for reflection
public @interface SastaInjection {
}