import java.util.Arrays;
public class Test {
  private int[] array;
  public Test(int[] aIn){
    array = aIn;
  }
  public void randomize(){
    for (int val : array)
    {
      val = (int)(Math.random()*100);
    }
  }
  public void print(){
    System.out.println(array.toString());
    for (int val : array)
    {
      System.out.print(val+" ");
    }
  }

  public static void main(String[] args) {
    int[][] array = new int[3][5];
    System.out.println(Arrays.deepToString(array));
    int num = 0;
    int num1 = num++;
    int num2 = num++;
    System.out.println(num+" "+num1+" "+num2);
  }
}