import java.lang.reflect.*;

// class whose object is to be created
class Reflection {

    //creating a private field
    private String s;

    //constructor of this class
    //constructor 1
    //public constructor
    public Reflection() {
        s = "RamanRanjan";
    }

    //constructor 2
    //public
    //no arguments
    public void method() {
        System.out.println("The string is " + s);
    }

    // constructor 3
    //int as argument
    //public

    public void method1(int n) {
        System.out.println("the number is " + n);
    }

    // constructor 4
    //private method
    private void method2() {
        System.out.println("Private method invoked");
    }
}
//main class

class Test {

}
