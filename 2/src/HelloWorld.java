package mypackage;

public class HelloWorld{
	int a=3,b=4;
	
	public static void StaticHello(){
		System.out.println("This's a static Hello World");
	}

	public void Hypotenuse() {
		double c = Math.sqrt(a*a+b*b);
		System.out.println("Hypotenuse of a right triangle with legs "+a+" and "+b+" is equal to "+c);
	}
}