public class MathEx
{   
    public static void main(String[] args)
    {
        System.out.println ();
        System.out.println (swap(123  ));
        System.out.println (swap(1234 ));
        System.out.println (swap(12345));
        System.out.println ();
        timeLeft(1, 15, 4, 36);
        timeLeft(1, 34, 8, 20);
        System.out.println ();
        timeLeftNoLogic(1, 15, 4, 36);
        timeLeftNoLogic(1, 34, 8, 20);
        System.out.println ();
        System.out.println (dayOfWeek(0, 1 ));
        System.out.println (dayOfWeek(0, 14));
        System.out.println (dayOfWeek(6, 22));
        System.out.println (dayOfWeek(5, 4 ));
        System.out.println (dayOfWeek(1, 24));
        System.out.println (dayOfWeek(2, 1 ));

    }
    /**swaps the last two digits of an integer*/
    static int swap(final int numin)
    {
        return ((numin/100)*100)+((numin/10)%10)+((numin%10)*10);
    }
    /**returns amount of time between two given times using logic. (ex: 4:20-3:40="0 hours and 40 minutes")*/
    static void timeLeft (final int curHour, final int curMin, final int depHour, final int depMin) 
    {
        assert ((curHour <= depHour & curMin <= depMin) || (curHour < depHour & curMin > depMin)): "invalid input supplied for timeLeft. deptime should be greater than curtime.";
        final int outHour = (curMin <= depMin) ? (depHour - curHour) : (depHour - 1  - curHour);
        final int outMin  = (curMin <= depMin) ? (depMin  - curMin ) : (depMin  + 60 - curMin );
        System.out.println (outHour + " hours and " + outMin + " minutes.");     
    }
    /**returns amount of time between two given times using math. (ex: 4:20-3:40="0 hours and 40 minutes")*/
    static void timeLeftNoLogic (final int curHour, final int curMin, final int depHour, final int depMin) 
    {
        assert ((curHour <= depHour & curMin <= depMin) || (curHour < depHour & curMin > depMin)): "invalid input supplied for timeLeft. deptime should be greater than curtime.";
        int timeLeft = (((depHour*60)+depMin)-((curHour*60)+curMin));
        System.out.println ((timeLeft / 60) + " hours and " + (timeLeft % 60) + " minutes.");   
    }
    /**returns the current day of week given the day of week the month started on and current date. (0=Sunday, 1=Monday, etc.)*/
    static int dayOfWeek(final int firstDay, final int curDate)
    {
        assert (firstDay < 7): "please provide a valid first day of week. 0=Sunday, 1=Monday, etc.";
        assert (firstDay >=0 & curDate >=0): "dayOfWeek cannot handle a negative date or day of week.";
        return (((curDate-1)+firstDay)%7);
    }
}
