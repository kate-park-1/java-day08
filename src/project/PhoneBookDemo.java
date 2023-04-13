package project;

public class PhoneBookDemo {
  public static void main(String args[]) {
    PhoneBook pb = new PhoneBook();  // pb 인스턴스 생성시 내부적으로 scanner 인스턴스 생성
    pb.run();  // 전화번호 관리 메소드를 실행
  }
}
