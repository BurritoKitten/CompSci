#include <cstdlib>
#include <iostream>

class Fraction
{
private:
    int numerator_{0};
    int denominator_{1};

public:
    Fraction(int numeratorIn, int denominatorIn) : numerator_(numeratorIn), denominator_(denominatorIn) {}
    Fraction() {}

    void numerator(int numerator_) { this->numerator_ = numerator_; }
    int numerator() { return numerator_; }
    void denominator(int denominator_) { this->denominator_ = denominator_; }
    int denominator() { return denominator_; }
    double decimalValue() { return (double)numerator_ / denominator_; }

    void decimalValue(double target, double precision)
    {
        Fraction workingFraction(0, 1);
        if (precision >= 1)
        {
            int i = precision;
            precision = 1;
            for (; i > 0; i--)
            {
                precision /= 10;
            }
        }
        workingFraction.decimalValueGivenBase(target, 1);
        while (std::abs(target - workingFraction.decimalValue()) > precision)
        {
            workingFraction.decimalValueGivenBase(target, workingFraction.denominator() + 1);
        }
        *this = workingFraction;
    }

    void decimalValueGivenBase(double target, int base)
    {
        this->denominator(base);
        this->numerator((int)(base * target + 0.5));
    }

    void decimalValueGivenMaxBase(double target, double precision, int denominator = 1)
    {
        Fraction workingFraction = Fraction(0, 0);
        Fraction currentBest = Fraction(); 
        while (workingFraction.denominator() <= precision)
        {
            workingFraction.denominator(workingFraction.denominator() + 1);

            workingFraction.numerator((int)(workingFraction.denominator() * target + 0.5));

            if (std::abs(target - workingFraction.decimalValue()) < std::abs(target - currentBest.decimalValue()))
            {
                currentBest = workingFraction;
            }
        }

        *this = currentBest;
    }

    void printFraction()
    {
        std::cout << this->numerator(), " ";
        std::cout << "/";
        std::cout << this->denominator(), " ";
    }

    double deviation(double desiredValue) { return desiredValue - (this->decimalValue()); }
};