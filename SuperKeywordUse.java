import java.lang.System;

class A{
	A()
	{
		System.out.println("I'm in class A");
	}
}

class B extends A{
	B()
	{
		System.out.println("I'm in class B");
	}

	public static void main(String[] args){
		B obj = new B();
	}
}
