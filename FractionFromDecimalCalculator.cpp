#include <iostream>
#include <string>
#include "Fraction.cpp"
#include <unistd.h>

int main()
{
    using namespace std;
    Fraction whatIsValue = Fraction();
    // idea of project was to look for 1+(.5*sqrt(3))+(.5/sqrt(3)) aka the ratio of nested circles.
    // approx. 2.15470053837925152901829756100391491129520350253058004370133658674167907642613285 or about 28/13
    double testNum = 2.874512798465;
    cout << "What number would you like to convert?\n";
    cin >> testNum;
    double testPrescision = 3;
    cout << "What presicion would you like?\n";
    cin >> testPrescision;
    whatIsValue.decimalValue(testNum, testPrescision);
    cout << "\nThe requested fraction is ";
    whatIsValue.printFraction();
    cout << "\nThis has a value of ";
    cout << whatIsValue.decimalValue();
    cout << "\nThis has a deviation of about ";
    cout << whatIsValue.deviation(testNum);
    cout << " from the requested value.\n";
    sleep(30);
    return 0;
}