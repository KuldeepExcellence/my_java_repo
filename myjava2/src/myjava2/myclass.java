package myjava2;






class A
{
	int a ; 
	A(int a)
	{
		this.a = a;
		System.out.println("This is Constructor of class a ");	
		System.out.println(this.a);
	}
	
}

class B extends A
{
	int b;
	B(int b , int a)
	{
		super(a);
		this.b=b;
		System.out.println("This is Constructor of class b ");	
		System.out.println(this.b);
		
	}
	
}

public class myclass 
{
	public static void main(String args[])
	{
//		A o = new A(12);
		B obj = new B(-9,-8);
	}	
}