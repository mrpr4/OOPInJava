class Test2{
	void show(){
	System.out.println("1");
	}
}
class Xyz extends Test2
{
	void show(){
		System.out.println("2");
	}
}

class Runner{
	public static void main(String[] args){
		
	//Test t = new Test();
	//t.show();
	Xyz x = new Xyz();
	x.show();
}
}
