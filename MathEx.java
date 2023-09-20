public class MathEx
{
    public static void main(String[] args)
    {
        System.out.println(swap(123));
        System.out.println(swap(1234));
        System.out.println(swap(12345));
        System.out.println("\n");
        System.out.println(timeLeft(1, 15, 4, 36));
        System.out.println(timeLeft(1, 34, 8, 20));
        System.out.println("\n");
        System.out.println(dayOfWeek(0, 1));
        System.out.println(dayOfWeek(0, 14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1, 24));
        System.out.println(dayOfWeek(2, 1));
    }
    static int swap(final int numin)
    {
        int numout = (numin/100)*100;
        numout += (numin/10)%10;
        numout += (numin%10)*10;
        return numout;
    }
    static String timeLeft(
        final int curHour, final int curMin, 
        final int depHour, final int depMin) 
    {
        final int outHour = (curMin <= depMin) ? (depHour - curHour) : (depHour - 1 - curHour);
        final int outMin = (curMin <= depMin) ? (depMin - curMin) : (depMin + 60 - curMin);
        final String outStr = outHour + " hours and " + outMin + " minutes.";
        return outStr;     
    }
    static int dayOfWeek(final int firstDay, final int curDate)
    {
        return (((curDate-1)+firstDay)%7);
    }
}
