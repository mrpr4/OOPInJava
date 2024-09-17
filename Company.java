import java.lang.System;
//import java.io.PrintStream;

class Empolee{
	private int emp_id;
	
	public int getEmp(){
		return emp_id;
	}
	
	public void setEmp(int value){
		emp_id = value;
	}
}

class Company{

	public static void main(String[] args){
		
		Empolee emp = new Empolee();
		emp.setEmp(14);
		System.out.println(emp.getEmp());
	}

}
