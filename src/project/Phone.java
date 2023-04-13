package project;

// 하나의 전화 번호 정보를 가지는 클래스
class Phone {
  private String name; // 이름
  private String address; // 주소
  private String telNum; // 전화 번호

  public Phone(String name, String address, String telNum) {
    this.name = name;
    this.address = address;
    this.telNum = telNum;
  }

  public String getName() {return name;}
  public String getAddress() {return address;}
  public String getTelNum() {return telNum;}

  public String toString() {
    return name + " " + address + " " + telNum;
  }
}