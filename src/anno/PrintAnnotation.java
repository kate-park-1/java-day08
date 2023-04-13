package anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
  // @PrintAnnotation("+") , @PrintAnnotation(number=20) , @PrintAnnotation(value="*", number=20)
  String value() default "-";
  int number() default 15;
}
