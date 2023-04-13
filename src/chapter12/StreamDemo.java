package chapter12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(r.nextInt(30));
    }
    System.out.println("10개의 30보다 작은 list" + list);
    List<Integer> gt10 = new ArrayList<>();
    for(int i : list) {
      if(i > 10) {
        gt10.add(i);
      }
    }
    System.out.println("10보다 큰 것만 필터한 list" + gt10);
    Collections.sort(gt10);
    System.out.println("정렬 결과 : " +gt10);

    // 스트림을 생성.10개만 선택.10보다 큰것만 선택.중복제거.정렬.출력
    new Random().ints(0,30)
        .limit(10)
        .filter(x-> x > 10)
        .distinct()
        .sorted()
        .forEach(System.out::println);
  }
}
