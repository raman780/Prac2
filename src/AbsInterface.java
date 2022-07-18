/*
abstract class Base{
    public Base() {
        System.out.println("Hello");
    }
    public void sayHello(){
        System.out.println("Hello Morning");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Base2 extends Base{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good");
    }
}

abstract class Base3 extends Base{
    public void th(){
        System.out.println("hi");
    }
}


public class AbsInterface {
    public static void main(String[] args){
             Base2 b = new Base2();
             Base b1 = new Base(); //{
//                 @Override
//                 public void greet() {
//
//                 }
//
//                 @Override
//                 public void greet2() {
//
//                 }
//             };
             Base3 b3 = new Base3(); //{
//                 @Override
//                 public void greet() {
//
//                 }
//
//                 @Override
//                 public void greet2() {
//
//                 }
//             };
        }
    }

 */

abstract class Base {
    abstract void display();
}

class ConcreteClass extends Base {
    void display() {
        System.out.println("Hi....");
    }
}

class JavaApp {
    public static void main(String[] args) {
        ConcreteClass C = new ConcreteClass();
        C.display();
        System.out.println("HHHHHHHHHHHH");
    }
}
