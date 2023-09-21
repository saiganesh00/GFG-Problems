package pkg20a91a05g3;
class Base
{
    int a,b,sum;
    Base(int x,int y)
    {   
       a = x;
       b = y; 
    }
    public void add()
    {    sum=a+b;   }
}
class Derived extends Base
{
    Derived()
   {   
      super(4,2);   
   }
    public void display()
    {   System.out.println("Sum of "+a+" and "+b+" is: "+sum);  }
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Derived d = new Derived();
        d.add();
        d.display(); 

	}

}
