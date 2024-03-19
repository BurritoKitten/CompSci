public class Box {
  private boolean isBlack;
  private int num;

  public Box(boolean isb, int n) {
    isBlack = isb;
    num = n;
  }

  public String toString() {
    if (isBlack) return "\u001B[40m\u001B[30mbl ";
    if (num >= 10)return"\u001B[47m\u001B[30m" + num + " ";
    if (num > 0) return "\u001B[47m\u001B[30m0" + num + " ";
    return "   ";
  }
}