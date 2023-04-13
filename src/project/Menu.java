package project;

public enum Menu {
  WRONG_MENU(-1),
  INSERT(1),
  DELETE(2),
  SEARCH(3),
  SHOWALL(4),
  EXIT(5);

  private final int value;
  Menu(int value) {
    this.value = value;
  }
}
