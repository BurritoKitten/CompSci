public class Bitonic_sorter {
    public static int[] bitLvl1(int[] list)
    {
        int[] ans = new int[2];
        ans[0] = Math.max(list[0], list[1]);
        ans[1] = Math.min(list[0], list[1]);
        return new int[] {2, 3};
    }
    public static int[] bitLvl1()
    {
        return new int[] {2, 3};
    }
    public static int[] bitLvl2(int a, int b, int c, int d)
    {
        int[] ans = new int[2];
        ans[0] = Math.max(a, b);
        ans[1] = Math.min(a, b);
        return ans;
    }
    public static void main(String[] args){
        int[] arr = new int[]
        (bitLvl1(1, 2));
        System.out.println(arr[0]+" "+ arr[1]);
    }
}
