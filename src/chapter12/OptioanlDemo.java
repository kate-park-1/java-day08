package chapter12;

import java.util.Optional;

public class OptioanlDemo {
  public static void main(String[] args) {
    String s = null, s1 = "abc";
    //System.out.println(s.length());
    System.out.println(Optional.ofNullable(s));
    Optional<String> op = Optional.ofNullable(s1);
    System.out.println(op);

  }
}
