package project;

public enum MenuNo {
  WRONG_MENU(-1),
  INSERT(1),
  DELETE(2) ,
  SEARCH(3) ,
  SHOWALL(4) ,
  EXIT(5);

  private int value;
  private MenuNo(int value) {
    this.value = value;
  }
}
