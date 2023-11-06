public class conditionals
{   public boolean chimpTrouble(boolean c1, boolean c2)
    {return c1==c2;}

    public boolean negPos(int n1, int n2, boolean neg)
    {   if (!neg) return n1>=0 != n2>=0;
        else return n1<0 && n2<0;
        //assumes 0 is positive
    }

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep)
    {   if (isAsleep == true) return false;
        if (isMom == true) return true;
        return !isMorning;
    }

    public String setAlarm(int dayOfWeek, boolean onVacation)
    {   if (onVacation == true)
        {   if (isWeekend(dayOfWeek)) return "off";
            else return "10:00";
        }
        else
        {   if (isWeekend(dayOfWeek)) return "10:00";
            else return "7:00";
        }
    }

    public boolean isWeekend(int dayOfWeek)
    {return (dayOfWeek==0 || dayOfWeek==6);}

    public boolean onesDigitSame(int numA, int numB, int numC)
    {return (numA%10==numB%10 || numB%10==numC%10 || numA%10==numC%10);}

    public int blackjack(int a, int b)
    {   if (a>21) a=0;
        if (b>21) b=0;
        return Math.max(a, b);
    }    
   
    public static void main (String[] args)
    {   conditionals now = new conditionals();
        System.out.println("chimpTrouble (true , true ) -> true : " + now.chimpTrouble (true , true ));
        System.out.println("chimpTrouble (false, false) -> true : " + now.chimpTrouble (false, false));
        System.out.println("chimpTrouble (true , false) -> false: " + now.chimpTrouble (true , false));
        System.out.println("chimpTrouble (false, true ) -> false: " + now.chimpTrouble (false, true ));
        System.out.println();
        System.out.println("negPos ( 1, -1, false) -> true : " + now.negPos (1, -1, false));
        System.out.println("negPos (-1,  1, false) -> true : " + now.negPos (-1, 1, false));
        System.out.println("negPos ( 1,  1, false) -> false: " + now.negPos (1, 1, false));
        System.out.println("negPos (-1, -1, false) -> false: " + now.negPos (-1, -1, false));
        System.out.println("negPos (-4, -5, true ) -> true : " + now.negPos (-4, -5, true ));
        System.out.println("negPos (-4,  5, true ) -> false: " + now.negPos (-4, 5, true ));
        System.out.println("negPos ( 4,  5, true ) -> false: " + now.negPos (4, 5, true ));
        System.out.println("negPos ( 4, -5, true ) -> false: " + now.negPos (4, -5, true ));
        System.out.println();
        System.out.println("pickUpPhone (false, false, true ) -> false: " + now.pickUpPhone (false, false, true ));
        System.out.println("pickUpPhone (true , true , true ) -> false: " + now.pickUpPhone (true , true , true ));
        System.out.println("pickUpPhone (true , true , false) -> true : " + now.pickUpPhone (true , true , false));
        System.out.println("pickUpPhone (false, true , false) -> true : " + now.pickUpPhone (false, true , false));
        System.out.println("pickUpPhone (true , false, false) -> false: " + now.pickUpPhone (true , false, false));
        System.out.println("pickUpPhone (false, false, false) -> true : " + now.pickUpPhone (false, false, false));
        System.out.println();
        System.out.println("setAlarm (1, false) -> '7:00' : " + now.setAlarm (1, false));
        System.out.println("setAlarm (5, false) -> '7:00' : " + now.setAlarm (5, false));
        System.out.println("setAlarm (0, false) -> '10:00': " + now.setAlarm (0, false));
        System.out.println("setAlarm (2, true ) -> '10:00': " + now.setAlarm (2, true ));
        System.out.println("setAlarm (4, true ) -> '10:00': " + now.setAlarm (4, true ));
        System.out.println("setAlarm (6, true ) -> 'off'  : " + now.setAlarm (6, true ));
        System.out.println();
        System.out.println("onesDigitSame ( 23, 19, 13) -> true : " + now.onesDigitSame (23, 19, 13));
        System.out.println("onesDigitSame ( 23, 19, 12) -> false: " + now.onesDigitSame (23, 19, 12));
        System.out.println("onesDigitSame ( 23, 19,  3) -> true : " + now.onesDigitSame (23, 19, 3));
        System.out.println("onesDigitSame (423, 13,  3) -> true : " + now.onesDigitSame (423, 13, 3));
        System.out.println("onesDigitSame ( 23, 29, 25) -> false: " + now.onesDigitSame (23, 29, 25));
        System.out.println();
        System.out.println("blackjack (19, 21) -> 21: " + now.blackjack (19, 21));
        System.out.println("blackjack (21, 19) -> 21: " + now.blackjack (21, 19));
        System.out.println("blackjack (19, 22) -> 19: " + now.blackjack (19, 22));
        System.out.println("blackjack ( 8,  8) ->  8: " + now.blackjack (8, 8));
        System.out.println("blackjack (25, 24) ->  0: " + now.blackjack (25, 24));
        System.out.println("blackjack (17,  9) -> 17: " + now.blackjack (17, 9));
        System.out.println("blackjack (12, 18) -> 18: " + now.blackjack (12, 18));    
    }
}