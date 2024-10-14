// function overriding
 class Test{
       void show(){
        System.out.println("1");
    }
}
class Xyz extends Test{
     void show(){
        // super.show();
        System.out.println("2");
    }
}

class Run{
    public static void main(String[] args) {
        Test t = new Test();
        t.show();

        Xyz x = new Xyz();
        x.show();
    }
}  