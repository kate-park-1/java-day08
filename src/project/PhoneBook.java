package project;

import java.util.*;

public class PhoneBook {
  // 메뉴 번호를 위한 상수를 정의한다. CRUD 중 update만 없음.
//  private final int INSERT = 1;
//  private final int DELETE = 2;
//  private final int SEARCH = 3;
//  private final int SHOWALL = 4;
//  private final int EXIT = 5;
  private Scanner scanner;
  private HashMap<String, Phone> map = new HashMap<String, Phone>();

  public PhoneBook() {
    scanner = new Scanner(System.in);
  }

  // 전화번호 관리를 실행하는 메소드
  public void run() {
    System.out.println("----------------------------------------------------");
    System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다.");
    System.out.println("----------------------------------------------------");
    while (true) {
      System.out.println("등록:1. 삭제:2, 찾기:3, 전체보기:4, 종료:5 ");
      MenuNo menu = readNumber();
      switch (menu) {
        case INSERT:
          insert();
          break;
        case DELETE:
          delete();
          break;
        case SEARCH:
          search();
          break;
        case SHOWALL:
          showAll();
          break;
        case EXIT:
          System.out.println("프로그램을 종료합니다...");
          return;
        default:
          System.out.println("["+menu+"]" + " 존재하지 않는 메뉴입니다. 다시 입력하세요.");
          continue;
      }
    }
  }

  // 삽입 메뉴를 구현하며 하나의 전화 번호 레코드를 저장한다.
  private void insert() {
    System.out.print("이름 => ");
    String name = scanner.nextLine();
    if (map.get(name) != null) {
      System.out.println("이미 존재하는 사람입니다.");
      return;
    }

    System.out.print("주소 => ");
    String address = scanner.nextLine();
    System.out.print("전화번호 => ");
    String telNum = scanner.nextLine();

    // 해쉬 테이블에 삽입
    map.put(name, new Phone(name, address, telNum));
  }

  // 삭제 메뉴를 구현하며 하나의 전화 번호 레코드를 삭제한다.
  private void delete() {
    Set<String> keys = map.keySet(); // key 문자열을 가진 집합 Set 컬렉션 리턴
    if(keys.isEmpty()) {
      System.out.println("삭제할 정보가 없습니다.");
      return;
    }
    System.out.print("이름 => ");
    String name = scanner.nextLine();
    Phone p = map.remove(name); // 해쉬 테이블에서 삭제
    if (p == null)
      System.out.println(name + "는 등록되지 않은 사람입니다.");
    else {
      System.out.println(name + "은 삭제되었습니다.");
    }
  }

  // 찾기 메뉴를 구현하며 하나의 전화 번호 레코드를 검색한다.
  private void search() {
    Set<String> keys = map.keySet(); // key 문자열을 가진 집합 Set 컬렉션 리턴
    if(keys.isEmpty()) {
      System.out.println("등록된 정보가 없습니다.");
      return;
    }
    System.out.print("이름 => ");
    String name = scanner.nextLine();
    Phone p = map.get(name); // 해쉬테이블에서 검색
    if (p == null)
      System.out.println(name + "는 등록되지 않은 사람입니다.");
    else
      System.out.println(p.toString());
  }

  // 전체보기 메뉴를 구현한다.
  private void showAll() {
    Set<String> keys = map.keySet(); // key 문자열을 가진 집합 Set 컬렉션 리턴
    Iterator<String> it = keys.iterator(); // key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
    if(keys.size() ==0) {
      System.out.println("출력할 내용이 없습니다.");
    }
    while (it.hasNext()) {
      String name = it.next();
      Phone p = map.get(name);
      System.out.println(p.toString());
    }
  }

  private MenuNo readNumber() {
    String s = "";
    int n = -1;
    try {
      s = scanner.nextLine();
      n = getMenu(s);
    } catch (InputMismatchException e) {
      return MenuNo.WRONG_MENU;
    }
    return MenuNo.values()[n];
  }

  private int getMenu(String s) {
    //boolean isMenu = false;
    int menuNo = 0;
    if (s.length() == 1 && Character.isDigit(s.charAt(0))) {
      menuNo = Integer.parseInt(s);
    }
    return menuNo;
  }
}
