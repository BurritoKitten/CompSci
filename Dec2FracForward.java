//import java.util.Scanner;
public class Dec2FracForward {
    public static double[] closestFrac(int denominator, double target, long lastNumerator)
    {
        long numerator = lastNumerator-(((int)target)*denominator);
        double smolTarget = target%1;
        double answer[] = {0, 0, 0, 0};
        while (numerator <= smolTarget*denominator){numerator++;}
        answer[0] = numerator-1+(((int)target)*denominator);
        answer[1] = target-answer[0]/denominator;
        answer[2] = numerator+(((int)target)*denominator);
        answer[3] = target-answer[2]/denominator;
        return answer;
    }

    /*public static void manualConvert()
    {
        System.out.println("What is your number?");
        Scanner sc = new Scanner (System. in);
        String targetAsString = sc.nextLine();
        double target = Double.parseDouble(targetAsString);
        System.out.println("To what denominator would you like to search?");
        String precisionAsString = sc.nextLine();
        int precision = Integer.parseInt(precisionAsString);
        for(int currentDenominator = 1; currentDenominator <= precision; currentDenominator++)
        {
            double currentNum[] = closestFrac(currentDenominator, target);
            System.out.print((int)currentNum[0]+"/"+currentDenominator+"  ");
            System.out.printf("%2.5f", currentNum[1]);
            System.out.print("  ");
            System.out.print((int)currentNum[2]+"/"+currentDenominator+"  ");
            System.out.printf("%2.5f", currentNum[3]);
            System.out.print("  ");
            System.out.println();
        }
        
        sc.close();
    }
    */

    public static int[] convert(double TargetNumber, double accuracy)
    {
        if (accuracy>1){accuracy = Math.pow(10, -accuracy);}
        if (accuracy==0){accuracy = 1;}
        //numerator, denominator
        int[] returnFraction = {0, 0};
        long lastNumerator = 0;
        while (returnFraction[0]==0)
        {
            returnFraction[1]++;
            //System.out.print("Failed\nTrying denominator "+returnFraction[1]+": ");
            double[] currentTray = closestFrac(returnFraction[1], TargetNumber, lastNumerator);
            lastNumerator = (long)currentTray[0];
            for (int i=1; i<4; i+=2)
            {
                if (Math.abs(currentTray[i])<=accuracy)
                {
                    if (returnFraction[0]==0)
                    {returnFraction[0] = (int)currentTray[i-1];}
                    else if (currentTray[1]>-currentTray[3]) 
                    {returnFraction[0] = (int)currentTray[i-1];}
                    System.out.println("Success\n"+TargetNumber+"  "+returnFraction[0]+"/"+returnFraction[1]+"  "+(TargetNumber-((double)returnFraction[0]/returnFraction[1])));
                }
            }
        }
        return returnFraction;
    }

    public static void main(String[] args)
    {
        // looking for 1+(.5*sqrt(3))+(.5/sqrt(3)) aka ratio of nested circles.
        // keep in mind the double datatype is only sufficient to 15 digits.
        double TargetNumber = 2.1547005383792515290182975610039;
        convert(TargetNumber, 15);
        //System.out.println(TargetNumber+"  "+fraction[0]+"/"+fraction[1]+"  "+(TargetNumber-((double)fraction[0]/fraction[1])));

    }
}