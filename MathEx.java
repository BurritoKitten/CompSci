import java.util.Scanner;
public class MathEx
{
    public static void main(String[] args)
    {
        assert (swap(123)) == 132: "swap failed on trial one";
        assert (swap(1234)) == 1243: "swap failed on trial two";
        assert (swap(12345)) == 12354: "swap failed on trial three";
        System.out.println(timeLeft(1, 15, 4, 36));
        assert (timeLeft(1, 15, 4, 36)).equals ("3 hours and 21 minutes."): "timeLeft failed on trial one";
        assert (timeLeft(1, 34, 8, 20)).equals ("6 hours and 46 minutes."): "timeLeft failed on trial two";
        assert (dayOfWeek(0, 1)) == 0: "dayOfWeek failed on trial one";
        assert (dayOfWeek(0, 14)) == 6: "dayOfWeek failed on trial two";
        assert (dayOfWeek(6, 22)) == 6: "dayOfWeek failed on trial three";
        assert (dayOfWeek(5, 4)) == 1: "dayOfWeek failed on trial four";
        assert (dayOfWeek(1, 24)) == 3: "dayOfWeek failed on trial five";
        assert (dayOfWeek(2, 1)) == 2: "dayOfWeek failed on trial six";
        System.out.println("Success! Error below to prove valid syntax used for assert.");
        assert ("2+2").equals ("fish"): "valid syntax proof. NOT AN ERROR!";
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
        return outHour + " hours and " + outMin + " minutes.";     
    }
    /**returns the current day of week given the day of week the month started on and current date.
     *(0 - Sunday, 2 - Monday, ETC.)
    */
    static int dayOfWeek(final int firstDay, final int curDate)
    {
        return (((curDate-1)+firstDay)%7);
    }
}
