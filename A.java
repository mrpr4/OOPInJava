
// single inheritance
class A {
    void showA() {
        System.out.println("This is A class");
    }
}

class B extends A {
    void showB() {
        System.out.println("This is B class");
    }

}

class C extends A {
    void showC() {
        System.out.println("This is C class");
    }

}

/**
 * This is the run class which is use to run all the inheritance types
 */
class Run {

    public static void main(String[] args) {
        // B single = new B();
        // single.showA();
        // single.showB();

        // C multilevel = new C();
        // multilevel.showA();
        // multilevel.showB();
        // multilevel.showC();

        // Hierarchical inheritance
        System.out.println("With first B child");
        B h1 = new B();
        h1.showA();
        h1.showB();
        // h1.showC(); this line is not run because it inherits only the property of the A not C class

        System.out.println("\nWith second C child");
        C h2 = new C();
        h2.showA();
        // h2.showB(); this line is not run because it inherits only the property of the A not B class
        h2.showC();

    }
}