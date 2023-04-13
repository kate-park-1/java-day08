package chapter12;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Optional1Demo {
  public static void main(String[] args) {
    System.out.println(divide(10.0, 0.0));
    System.out.println(divide(10.0,2.0));
    System.out.println(divide(10.0,2.0).getAsDouble());
  }

  public static OptionalDouble divide(double x , double y){
    return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
  }
}
