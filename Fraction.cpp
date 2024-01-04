#include <cstdlib>

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
    double decimalValue(){return (double)numerator_/denominator_;}
    
    void decimalValue(double target, double precision, int denominator = 1)
    {
        Fraction workingFraction(0, 1);
        if (precision>=1)
            {
                int i = precision;
                precision = 1;
                for (;i>0;i--){precision/=10;}
            }
        while (std::abs(target - workingFraction.decimalValue()) > precision)
        {
            workingFraction.denominator(workingFraction.denominator()+1);
            workingFraction.numerator((int)(workingFraction.denominator()*target+0.5));
        }
        *this = workingFraction;
    }

    void decimalValueFromSize(double target, double precision, int denominator = 1)
    {
        Fraction workingFraction = Fraction();
        Fraction currentBest = Fraction();
        while (workingFraction.denominator() <= precision)
        {
            workingFraction.denominator(workingFraction.denominator()+1);

            workingFraction.numerator((int)(workingFraction.denominator()*target+0.5));

            if (std::abs(target-workingFraction.decimalValue())<std::abs(target-currentBest.decimalValue()))
            {
                currentBest = workingFraction;
            }
        }

        *this = currentBest;
    }
};