class Test {
    Test() {
        System.out.println("Test Constructor");
    }
}

public class Main {
    public static void main(String[] args) {

        Test t1 = new Test();
        new Test();
    }

}