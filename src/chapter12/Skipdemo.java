package chapter12;

import jdk.jshell.execution.Util;

import java.util.stream.Stream;

public class Skipdemo {
  public static void main(String[] args) {
    Stream.of("a1","b1","b2","c1","c2","c3")
        .filter(s->s.startsWith("c"))
        .skip(2)
        .forEach(System.out::print);
  }
}
