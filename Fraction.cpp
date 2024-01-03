#include <cstdlib>
#include <iostream>

class Math{
    public:
    static long double abs(long double numin)
    {
        if (numin<0){return -numin;}
        return numin;
    }
/*
    static long double pow(double numin, int power)
    {
        if (power<0){
            power=-power;
            numin=1/numin;
        }
        if (power=0){numin=1;}
        for (; power>1; power--){numin*=numin;}
        return numin;
    }
*/
};

class Fraction{
    private:
    int numerator_ {0};
    int denominator_ {1};

    public:
    Fraction(int numeratorIn, int denominatorIn)
    :numerator_(numeratorIn), denominator_(denominatorIn)
    {}
    Fraction(){}

    void numerator(int numin){numerator_ = numin;}
    int numerator(){return numerator_;}
    void denominator(int numin){denominator_ = numin;}
    int denominator(){return denominator_;}
    long double decimalValue(){return (double)numerator_/denominator_;}
    
    void decimalValue(long double target, long double precision, int denominator = 1)
    {
        Fraction workingFraction(0, 1);
        if (precision>=1)
            {
                int i = precision;
                precision = 1;
                for (;i>0;i--){precision/=10;}
            }
        while (Math::abs(target - workingFraction.decimalValue()) > precision)
        {
            workingFraction.denominator(workingFraction.denominator()+1);
            workingFraction.numerator((int)(workingFraction.denominator()*target+0.5));
        }
        *this = workingFraction;
    }

    void decimalValueFromSize(long double target, long double precision, int denominator = 1)
    {
        Fraction workingFraction = Fraction();
        Fraction currentBest = Fraction();
        while (workingFraction.denominator() <= precision)
        {
            workingFraction.denominator(workingFraction.denominator()+1);

            workingFraction.numerator((int)(workingFraction.denominator()*target+0.5));

            if (Math::abs(target-workingFraction.decimalValue())<Math::abs(target-currentBest.decimalValue()))
            {
                currentBest = workingFraction;
            }
        }

        *this = currentBest;
    }


};    

int main()
{
    Fraction whatIsValue = Fraction();
    // looking for 1+(.5*sqrt(3))+(.5/sqrt(3)) aka ratio of nested circles.
    // approx. 2.15470053837925152901829756100391491129520350253058004370133658674167907642613285 or 28/13
    whatIsValue.decimalValue(2.15470053837925152901829756100391491129520350253058004370133658674167907642613285, 20);
    std::cout << whatIsValue.numerator(), " ";
    std::cout << "/";
    std::cout << whatIsValue.denominator(), " ";
    std::cout << "\n";
    std::cout << 2.15470053837925152901829756100391491129520350253058004370133658674167907642613285-whatIsValue.decimalValue();
    for (int i; i<100; i++)
    {
        std::cout << "\n";
        long double f = 1;
        for (int e = i; e>0; e--){f/=10;}
        std::cout << f;
    }
}