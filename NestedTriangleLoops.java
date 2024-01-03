public class NestedTriangleLoops {
    public void eights(){
        for(int value=8; value>0; value-=2)
        {
            for(int repeatRemaining=(8-value)/2; repeatRemaining>0; repeatRemaining--)
            {System.out.print(" ");}
            for(int repeatRemaining=value; repeatRemaining>0; repeatRemaining--)
            {System.out.print(value);}
            System.out.println();
        }
    }

    public void alternate(int input)
    {
        for(int line=0; line<input; line++)
        {
            if(line%2==0)
            {
                for(int character=0; character<=line; character++)
                {System.out.print(character+1);}
            }
            else
            {
                for(int character=0; character<=line; character++)
                {System.out.print(line-character+1);}
            }
            System.out.println();
        }
    }

    public void isosceles(int input)
    {
        for(int line=0; line<input; line++)
        {
            for(int repeatRemaining=input-line-1; repeatRemaining>0; repeatRemaining--)
            {System.out.print(" ");}
            for(int repeatRemaining=line*2+1; repeatRemaining>0; repeatRemaining--)
            {
                int numberToPrint=repeatRemaining;
                if(repeatRemaining>line+1){numberToPrint=(line+1)*2-repeatRemaining;}
                System.out.print(numberToPrint);
            }
            System.out.println();
        }
    }

    public void upSideDown(int startNumber, int endNumber)
    {
        for(int lineStartNumber=startNumber; lineStartNumber>=endNumber; lineStartNumber--)
        {
            for(int repeatRemaining=startNumber-lineStartNumber; repeatRemaining>0; repeatRemaining--)
            {System.out.print(" ");}
            for(int numberToPrint=lineStartNumber; numberToPrint>=endNumber; numberToPrint--)
            {System.out.print(numberToPrint);}
            for(int numberToPrint=endNumber+1; numberToPrint<=lineStartNumber; numberToPrint++)
            {System.out.print(numberToPrint);}
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        NestedTriangleLoops instance = new NestedTriangleLoops();
        instance.eights();
        System.out.println();
        instance.alternate(5);
        System.out.println();
        instance.alternate(6);
        System.out.println();
        instance.isosceles(5);
        System.out.println();
        instance.isosceles(6);
        System.out.println();
        instance.upSideDown(9, 5);
        System.out.println();
        instance.upSideDown(8, 6);
    }
}