#include <iostream>
#include <string>
#include "Fraction.cpp"

int main()
{
    while (true)
    {
        Fraction whatIsValue = Fraction();
        // idea of project was to look for 1+(.5*sqrt(3))+(.5/sqrt(3)) aka the ratio of nested circles.
        // approx. 2.15470053837925152901829756100391491129520350253058004370133658674167907642613285 or about 28/13
        double testNum = 2.874512798465;
        std::cout << "What number would you like to convert?\n";
        std::cin >> testNum;
        double testPrescision = 3;
        std::cout << "What presicion would you like?\n";
        std::cin >> testPrescision;
        whatIsValue.decimalValue(testNum, testPrescision);
        std::cout << "\nThe requested fraction is ";
        std::cout << whatIsValue.numerator(), " ";
        std::cout << "/";
        std::cout << whatIsValue.denominator(), " ";
        std::cout << "\nThis has a deviation of ";
        std::cout << testNum-whatIsValue.decimalValue();
        std::cout << " from the requested value.\n\nWould you like to quit? [Y/n]\n";
        std::string quit;
        std::cin >> quit;
        if (!(quit=="n"||quit=="N"||quit=="No"||quit=="NO"||quit=="no"))
        {return 0;}
        std::cout << "\n\n";
    }
}