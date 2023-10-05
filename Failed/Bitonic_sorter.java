package Failed;
public class Bitonic_sorter
{
    public static int[] bitLvl1(int[] list)
    {
        int[] ans = new int[2];
        ans[0] = Math.max(list[0], list[1]);
        ans[1] = Math.min(list[0], list[1]);
        return ans;
    }
    public static int[] bitLvl2(int[] list)
    {
        int[] ans = new int[4];
        ans[0] = Math.max(list[0], list[1]);
        ans[1] = Math.min(list[0], list[1]);
        ans[2] = Math.max(list[2], list[3]);
        ans[3] = Math.min(list[2], list[3]);
        list = ans;
        ans[0] = Math.max(list[0], list[3]);
        ans[3] = Math.min(list[0], list[3]);
        ans[1] = Math.max(list[1], list[2]);
        ans[2] = Math.min(list[1], list[2]);
        list = ans;
        ans[0] = Math.max(list[0], list[1]);
        ans[1] = Math.min(list[0], list[1]);
        ans[2] = Math.max(list[2], list[3]);
        ans[3] = Math.min(list[2], list[3]);
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = bitLvl2(new int[] {2, 3, 4, 5});
        System.out.println(arr[0]+" "+ arr[1]+" "+ arr[2]+" "+ arr[3]);
    }
}
