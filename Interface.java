import java.lang.System;

interface I1{
	void show();	
}

interface I2{

	void display();
}


abstract class SystemX implements I1, I2{
	abstract void start();
}

abstract class CopyRun extends SystemX{
	abstract void go();
}


class InterfaceTest extends CopyRun{

	public void show()
	{
			System.out.println("1");
	}
	
	public void display()
	{
		System.out.println("2");
	}
	
	public void start()
	{
		System.out.println("It's time to eat");
	}
	
	public void go()
	{
		System.out.println("Go to Eat");
	}
	
	
	public static void main(String[] args){
		InterfaceTest t = new InterfaceTest();
		t.show();
		t.display();
		t.start();
		t.go();
	}
}
