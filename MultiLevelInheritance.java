package pkg20a91a05g3;
class Base1{
    public Base1()
    {
        System.out.println("Inside the Base class");
    }
    public void display()
    {   
    	System.out.println("Grand Parent for Derived2");  
    }
}
class Derived1 extends Base1{
    public Derived1()
    {   System.out.println("Inside Derived1/Parent2"); }
    public void display()
    {
        super.display();
        System.out.println("Parent for Derived2");
    }
}
class Derived2 extends Derived1{
    public Derived2()
    {
           System.out.println("Inside Derived2");
    }
    public void display()
    {
        super.display();
        System.out.println("Child for derived1");
    }
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Derived2 d=new Derived2();
        d.display();

	}

}
