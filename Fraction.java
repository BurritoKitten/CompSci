public class Fraction {
	private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments)
	public Fraction()
    {
        numerator=1;
        denominator=1;
    }



	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	
	// TODO  subtract()
	public Fraction subtract(Fraction other)
	{
		int n = this.numerator*other.denominator - this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	// TODO multiply()
	public Fraction multiply(Fraction other)
	{
		int n = this.numerator*other.numerator;
		int d = this.denominator*other.denominator;
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	// TODO toString()
	public String toString()
    {
        return numerator+"/"+denominator;
    }
	// TODO reciprocal()
	public Fraction reciprocal()
	{
		int n = denominator;
		int d = numerator;
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	// TODO
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);	// print the answer
			
		Fraction f4 = f1.subtract(f2);
		System.out.println(""+f4);
        //assert((""+f4).equals("-1/20")):"subtract returned wrong answer"; //remove, testing
		
		/*
		Add code to multiply f1 and f2 here
		
		Add code to call reciprocal here
		
		create 2 new fractions and add them here.
		
		*/	
		System.out.println(""+f1.multiply(f2));
		//assert((""+f1.multiply(f2)).equals("12/20")):"multiply returned wrong answer"; //remove, testing
		System.out.println(""+f1.reciprocal());
        //assert((""+f1.reciprocal()).equals("4/3")):"reciprocal returned wrong answer"; //remove, testing

		Fraction f5 = new Fraction(7,23);
		Fraction f6 = new Fraction(11,5);
		System.out.println(f5);
		System.out.println(f6);

		//assert(false):"NOT ERROR, proof of concept"; //remove, testing

	}

}