public class more_conditionals {
    public boolean isLeapYear(int year)
    {
        if (year%4!=0) return false;
        if (year%100==0) return false;
        return true;
    }

    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2)
    {
        if (year1<year2) return false;
        if (year1>year2) return true;
        if (month1<month2) return false;
        if (month1>month2) return true;
        if (day1<=day2) return false;
        else return true;
    }

    public int findBestFit(int space, int size1, int size2)
    {
        if (size1+size2<=space) return 3;
        int lSize = Math.max(size1, size2);
        int sSize = (size1==lSize) ? size2 : size1;
        if (lSize <= space){if (size1==lSize) return 1; return 2;} 
        if (sSize <= space){if (size1==sSize) return 1; return 2;}
        return 0;
    }

    public boolean makeBench(int small, int big, int goal)
    {
        if (small<goal%5) return false;
        if (goal/5*5 < big*5+((small-goal%5)*5/5)) return false;
        return true;
    }
    
    public static void main(String[] args)
    {
        assert false;
    }

}
