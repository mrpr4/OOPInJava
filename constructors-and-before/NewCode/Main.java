class Test {
    public int age;
    public String name;

    // no argument constructor
    public Test() {
        System.out.println("no Argument Constructor");
    }

    // paramentrized construcotr
    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // copy constructor
    Test(Test object, String name) {
        this.age = object.age;
        this.name = name;
    }

};

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test(); // default constructor
        Test t2 = new Test(); // no argument constructor
        Test t3 = new Test(22, "Ali");// parameterized constructor
        Test t4 = new Test(t3, "Zain"); // copy constructor

        System.out.println(t1.age); // 0 coming form default constructor
        System.out.println(t2.age); // 0 also comming form default constructor
        System.out.println(t3.age + " " + t3.name); // 22 coming from parameterized constructor
        System.out.println(t4.age + " " + t4.name); // 22 coming form the t3 copy constructor

    }

}