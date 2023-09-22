public class MathEx
{   
    public static void main(String[] args)
    {
        System.out.println (swap(123  ));
        System.out.println (swap(1234 ));
        System.out.println (swap(12345));
        
        System.out.println (timeLeft(1, 15, 4, 36));
        System.out.println (timeLeft(1, 34, 8, 20));
        
        System.out.println (dayOfWeek(0, 1 ));
        System.out.println (dayOfWeek(0, 14));
        System.out.println (dayOfWeek(6, 22));
        System.out.println (dayOfWeek(5, 4 ));
        System.out.println (dayOfWeek(1, 24));
        System.out.println (dayOfWeek(2, 1 ));


        assert (swap(123  )) == 132  : "swap failed on trial one"  ;
        assert (swap(1234 )) == 1243 : "swap failed on trial two"  ;
        assert (swap(12345)) == 12354: "swap failed on trial three";
        
        assert (timeLeft(1, 15, 4, 36)).equals ("3 hours and 21 minutes."): "timeLeft failed on trial one";
        assert (timeLeft(1, 34, 8, 20)).equals ("6 hours and 46 minutes."): "timeLeft failed on trial two";
        
        assert (dayOfWeek(0, 1 )) == 0: "dayOfWeek failed on trial one"  ;
        assert (dayOfWeek(0, 14)) == 6: "dayOfWeek failed on trial two"  ;
        assert (dayOfWeek(6, 22)) == 6: "dayOfWeek failed on trial three";
        assert (dayOfWeek(5, 4 )) == 1: "dayOfWeek failed on trial four" ;
        assert (dayOfWeek(1, 24)) == 3: "dayOfWeek failed on trial five" ;
        assert (dayOfWeek(2, 1 )) == 2: "dayOfWeek failed on trial six"  ;

        assert (false): "valid syntax proof. NOT AN ERROR!";
    }
    /**swaps the last two digits of an integer*/
    static int swap(final int numin)
    {
        return ((numin/100)*100)+((numin/10)%10)+((numin%10)*10);
    }
    /**returns amount of time between two given times. (ex: 4:20-3:40="0 hours and 40 minutes")*/
    static String timeLeft (final int curHour, final int curMin, final int depHour, final int depMin) 
    {
        assert ((curHour <= depHour & curMin <= depMin) || (curHour < depHour & curMin > depMin)): "invalid input supplied for timeLeft. deptime should be greater than curtime.";
        final int outHour = (curMin <= depMin) ? (depHour - curHour) : (depHour - 1  - curHour);
        final int outMin  = (curMin <= depMin) ? (depMin  - curMin ) : (depMin  + 60 - curMin );
        return outHour + " hours and " + outMin + " minutes.";     
    }
    /**returns the current day of week given the day of week the month started on and current date. (0=Sunday, 1=Monday, etc.)*/
    static int dayOfWeek(final int firstDay, final int curDate)
    {
        assert (firstDay < 7): "please provide a valid first day of week. 0=Sunday, 1=Monday, etc.";
        assert (firstDay >=0 & curDate >=0): "dayOfWeek cannot handle a negative date.";
        return (((curDate-1)+firstDay)%7);
    }
}
