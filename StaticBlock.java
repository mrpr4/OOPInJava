import java.lang.System;

class StaticBlock {

    static int i = 0;

    //static synchronized void add1() {
      //  i++;
    //}
    
    static void add1(){
    	i++;
    }

    static void show() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        add1();
        add1();
        add1();
        add1();
        add1();

        add1();
        add1();
        add1();
        add1();
        add1();

        add1();
        add1();
        add1();
        add1();
        add1();

        add1();
        add1();
        add1();
        add1();
        add1();

        add1();
        add1();
        add1();
        add1();
        add1();
        
        add1();
        add1();
        add1();
        add1();
        add1();

        show();
    }
}

