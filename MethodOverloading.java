package pkg20a91a05g3;
public class MethodOverloading {
public void ADD(int a, int b) {
	System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
	}
public void ADD(int a, double b) {
	System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
	}
public static void main(String[] args) {
	MethodOverloading MO = new MethodOverloading();
	MO.ADD(12, 24);
	MO.ADD(14, 15.54);
	}}
