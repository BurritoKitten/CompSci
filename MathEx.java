import java.util.Scanner;
public class MathEx
{
    public static void main(String[] args)
    {
        assert (swap(123)) == 132;
        assert (swap(1234)) == 1243;
        assert (swap(12345)) == 12354;
        assert (timeLeft(1, 15, 4, 36)) == "3 hours and 21 minutes.": "timeLeft failed";
        assert (timeLeft(1, 34, 8, 20)) == "6 hours and 46 minutes.": "timeLeft failed";
        assert (dayOfWeek(0, 1)) == 0;
        assert (dayOfWeek(0, 14)) == 6;
        assert (dayOfWeek(6, 22)) == 6;
        assert (dayOfWeek(5, 4)) == 1;
        assert (dayOfWeek(1, 24)) == 3;
        assert (dayOfWeek(2, 1)) == 2;
    }
    /**swaps the last two digits of an integer*/
    static int swap(final int numin)
    {
        return ((numin/100)*100)+((numin/10)%10)+((numin%10)*10);
    }
    /**returns amount of time between two given times*/
    static String timeLeft (final int curHour, final int curMin, final int depHour, final int depMin) 
    {
        final int outHour = (curMin <= depMin) ? (depHour - curHour) : (depHour - 1 - curHour);
        final int outMin  = (curMin <= depMin) ? (depMin - curMin)   : (depMin + 60 - curMin);
        final String outStr = outHour + " hours and " + outMin + " minutes.";
        return outStr;     
    }
    /**returns the current day of week given the day of week the month started on and current date.
     *(0 - Sunday, 2 - Monday, ETC.)
    */
    static int dayOfWeek(final int firstDay, final int curDate)
    {
        return (((curDate-1)+firstDay)%7);
    }
}
