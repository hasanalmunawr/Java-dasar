package oopJava.exceptionErrro;

import java.lang.ProcessBuilder.Redirect.Type;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {
  
  String name() ;
// anaticion hanya dapat digunakan di luat method
  String[] tags() default {};
}
