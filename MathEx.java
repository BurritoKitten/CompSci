public class MathEx{
    public static void main(String[] args) {
        System.out.println(swap(123));
    }
    static int swap(final int numin) {
        int numout = (numin/100)*100;
        numout += (numin/10)%10;
        numout += (numin%10)*10;
        return numout;
    }
    public static String repeater(final String charin, final int num) {
        String outnow = "";
        for (int i = 0; i < num; i++) {
            outnow += charin;
        }
        return outnow;
    }
}
