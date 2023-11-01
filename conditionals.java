public class conditionals 
{   public static boolean chimpTrouble(boolean c1, boolean c2) 
    {return c1==c2;}

    public static boolean negPos(int n1, int n2, boolean neg)
    {   if (!neg) return n1>=0 != n2>=0;
        else return n1<0 && n2<0;
        //assumes 0 is positive
    }

    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep)
    {   if (isAsleep == true) return false;
        else
        {   if (isMom == true) return true;
            else return !isMorning;
        }
    }

    public static String setAlarm(int dayOfWeek, boolean onVacation)
    {   if (onVacation == true)
        {   if (isWeekend(dayOfWeek)) return "off";
            else return "10:00";
        }
        else
        {   if (isWeekend(dayOfWeek)) return "10:00";
            else return "7:00";
        }
    }

    public static boolean isWeekend(int dayOfWeek) 
    {return (dayOfWeek==0 || dayOfWeek==6);}

    public static boolean onesDigitSame(int numA, int numB, int numC)
    {return (numA%10==numB%10 || numB%10==numC%10 || numA%10==numC%10);}

    public static int blackjack(int a, int b)
    {   if (a>21) a=0;
        if (b>21) b=0;
        return Math.max(a, b);
    }    
    
    public static void main (String[] args)
    {   System.out.println("chimpTrouble (true , true ) -> true : " + chimpTrouble (true , true ));
        System.out.println("chimpTrouble (false, false) -> true : " + chimpTrouble (false, false));
        System.out.println("chimpTrouble (true , false) -> false: " + chimpTrouble (true , false));
        System.out.println("chimpTrouble (false, true ) -> false: " + chimpTrouble (false, true ));
        System.out.println();
        System.out.println("negPos ( 1, -1, false) -> true : " + negPos (1, -1, false));
        System.out.println("negPos (-1,  1, false) -> true : " + negPos (-1, 1, false));
        System.out.println("negPos ( 1,  1, false) -> false: " + negPos (1, 1, false));
        System.out.println("negPos (-1, -1, false) -> false: " + negPos (-1, -1, false));
        System.out.println("negPos (-4, -5, true ) -> true : " + negPos (-4, -5, true ));
        System.out.println("negPos (-4,  5, true ) -> false: " + negPos (-4, 5, true ));
        System.out.println("negPos ( 4,  5, true ) -> false: " + negPos (4, 5, true ));
        System.out.println("negPos ( 4, -5, true ) -> false: " + negPos (4, -5, true ));
        System.out.println();
        System.out.println("pickUpPhone (false, false, true ) -> false: " + pickUpPhone (false, false, true ));
        System.out.println("pickUpPhone (true , true , true ) -> false: " + pickUpPhone (true , true , true ));
        System.out.println("pickUpPhone (true , true , false) -> true : " + pickUpPhone (true , true , false));
        System.out.println("pickUpPhone (false, true , false) -> true : " + pickUpPhone (false, true , false));
        System.out.println("pickUpPhone (true , false, false) -> false: " + pickUpPhone (true , false, false));
        System.out.println("pickUpPhone (false, false, false) -> true : " + pickUpPhone (false, false, false));
        System.out.println();
        System.out.println("setAlarm (1, false) -> '7:00' : " + setAlarm (1, false));
        System.out.println("setAlarm (5, false) -> '7:00' : " + setAlarm (5, false));
        System.out.println("setAlarm (0, false) -> '10:00': " + setAlarm (0, false));
        System.out.println("setAlarm (2, true ) -> '10:00': " + setAlarm (2, true ));
        System.out.println("setAlarm (4, true ) -> '10:00': " + setAlarm (4, true ));
        System.out.println("setAlarm (6, true ) -> 'off'  : " + setAlarm (6, true ));
        System.out.println();
        System.out.println("onesDigitSame ( 23, 19, 13) -> true : " + onesDigitSame (23, 19, 13));
        System.out.println("onesDigitSame ( 23, 19, 12) -> false: " + onesDigitSame (23, 19, 12));
        System.out.println("onesDigitSame ( 23, 19,  3) -> true : " + onesDigitSame (23, 19, 3));
        System.out.println("onesDigitSame (423, 13,  3) -> true : " + onesDigitSame (423, 13, 3));
        System.out.println("onesDigitSame ( 23, 29, 25) -> false: " + onesDigitSame (23, 29, 25));
        System.out.println();
        System.out.println("blackjack (19, 21) -> 21: " + blackjack (19, 21));
        System.out.println("blackjack (21, 19) -> 21: " + blackjack (21, 19));
        System.out.println("blackjack (19, 22) -> 19: " + blackjack (19, 22));
        System.out.println("blackjack ( 8,  8) ->  8: " + blackjack (8, 8));
        System.out.println("blackjack (25, 24) ->  0: " + blackjack (25, 24));
        System.out.println("blackjack (17,  9) -> 17: " + blackjack (17, 9));
        System.out.println("blackjack (12, 18) -> 18: " + blackjack (12, 18));    
    }
}