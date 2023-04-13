package chapter12;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Nation[] nations = new Nation[3];
    nations[0] = new Nation("Korea", 100);
    nations[1] = new Nation("America", 200);
    nations[2] = new Nation("Japan", 300);

    Stream<Nation> stream = Arrays.stream(nations);
    stream.filter(n -> n.getPopulation() >= 200)
        .map(Nation::getName)
        .forEach(System.out::println);
  }
}
