import java.lang.System;

class StaticMethod extends StDemo{

	static int a = 2;
	static void show(){
		System.out.println(a);
		display();
	}
	
	public static void main(String[] args){
		show();


	}
	
}

class StDemo{

	static void display(){
		System.out.println("2");
	}
}
