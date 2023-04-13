package project;

public class Phone {
  private String name;
  private String address;
  private String telno;

  public Phone(String name, String address, String telno) {
    this.name = name;
    this.address = address;
    this.telno = telno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getTelno() {
    return telno;
  }

  public void setTelno(String telno) {
    this.telno = telno;
  }

  @Override
  public String toString() {
    return "name=" + name + ", address=" + address + ", telno=" + telno;
  }
}
