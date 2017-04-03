package pl.akademiakodu;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Lukasz Kolacz on 29.03.2017.
 */

@Target(ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface UsingInternet {
}
