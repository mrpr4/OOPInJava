import java.lang.System;

class ThisDemo{
	
	void m1(ThisDemo td){
		System.out.println("We are inside the the M1 method");
	}
	void m2(){
		m1(this);
	}
	public static void main(String[] args){
		ThisDemo t = new ThisDemo();
		t.m2();
		
	}

}
