public class Test {
  public static int maxValue(int[] list) {
    int max = list[0];
    for (int i = 0; i < list.length - 1; i++) {
      max = Math.max(list[i], list[i + 1]);
    }
    return max;
  }

  public static void main(String[] args) {
    int max = maxValue({12, 7, -1, 25, 3, 9});
    System.out.println(max);
  }
}
