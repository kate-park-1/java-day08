package chapter12;

import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream is = IntStream.rangeClosed(1,5);

    IntStream intStream = is.filter(x -> {
      System.out.println("filter : " + x);
      return x % 2 == 0;
    });

    IntStream intStream1 = intStream.map(x -> {
      System.out.println("map : " + x);
      return x * x;
    });

    intStream1.forEach(x -> {
      System.out.println("forEach : " + x);
    });


    IntStream.rangeClosed(1,5)
        .filter(x -> x % 2 == 0)
        .map(x -> x * x)
        .forEach(System.out::println);

  }
}
