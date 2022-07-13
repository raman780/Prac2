// the final keyword in java is used to restrict the user. it can be used in many context.
//Final can be 1. variable 2. method and 3. clsaa
// The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable.
//Note-
// 1.it can be initialized in constructor only
// 2.the blank final variable can be static also which will be initialized in the static block only.

//Final variable:
//class Em {
//    final int salaryLimit = 200000;//final varibale
//
//    void increase() {
//        salaryLimit = 250000;// it will throw error : Cannot assign a value to final variable 'salaryLimit'
//    }
//
//    public static void main(String[] args) {
//        Em obj = new Em();
//        obj.increase();
//    }
//}

//Final method in Java
/*class Em_1 {
    final void increase() {
        System.out.println("Increasing");
    }

    class Intern extends Em_1 {
        void increase() { // we cannot override it because its final
            System.out.println("salary is increasing");
        }

        public static void main(String[] args) {
            Intern intern = new Intern();
            intern.increase();
        }
    }
}*/

//final class
// if we make any class final, we cannot extend it.

final class Em_2 {
}

/*
class Em_3 extends Em_2 { // it will throw ct error : cannot inherit from final Em_2
    static void increase() {
        System.out.println("Salary is increasing quarterly");
    }

    public static void main(String[] args) {
        Em_3 em = new Em_3();
        Em_3.increase();
    }
}
*/


//final method can be inherited but we can't override it.
class Em_9 {
    final void increase() {
        System.out.println("incresing");
    }
}

class Em_4 extends Em_9 {
    public static void main(String[] args) {
        Em_9 em = new Em_9();
        new Em_9().increase();
    }
}

//This keyword : In java it is a refrence variable that refers to the current object.
//usage of this keyword:
//1. this can be used to refer current class instance variable.
//2. this can be used to invoke current class method(implicitly)
//3. this() can be used to invoke current class constructor
//4. this can be passed as an argument in the method call
//5. this can be passed as argument in the constructor call
//6. this can be used to return the current class instance from the method

//note: as a begineer , we have to mainly focus on first three usages of this keyword.

//1.// this : to refer current class instance variable
// this keyword can be used to refer current class instance variable. If there is ambiguity betn the instance variables and parameters, this keyword resolves the problem of ambiguity.
//ambiguity in Java means those issues that are not defined clearly in the java language specification .
//the different results produced by different compilers on several example programs support the observations.

class Em_6 {
    int id;
    String name;
    float salary;

    Em_6(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("id : " + id + "Name: " + name + "Salary: " + salary);
    }

    class Em_7 {
        public static void main(String[] args) {
            Em_6 e1 = new Em_6(274293, "Raman", 50000f);
            Em_6 e2 = new Em_6(274300, "Arihant", 50000f);
            e1.display();
            e2.display();
        }
    }
}

//2. this keyword to invoke current class method
// we may invoke the method of the current class by using the this keyword.
//if we don't use this keyword compiler automatically adds this keyword while invoking the method let's see the example

class Ra {
    void m() {
        System.out.println("hello Raman");
    }

    void n() {
        System.out.println("hello Shiwam");
        //m(); //same as this.m()
        this.m();
    }
}

class Rn {
    public static void main(String[] args) {
        Ra a = new Ra();
        a.n();
    }
}


//super keyword: in java it is a reference variable which is used to refer immediate parent class object.
//whenever we create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

// Usage of java super keyword :
//1. super can be used to refer immediate parent class instance variable.
//2. super can be used to invoke immediate parent class method
//3. super() can be used to invoke immediate parent class constructor

//1. super is used to refer immediate parent class instance variable
// we can use super keyword to access the data member or  field of parent class.
//it is used if parent class and child class have same fields.


class Shyam {
    String javaExpertise = "Expert";
}

class Shiwam extends Shyam {
    String JavaExpertise = "Begineer";

    void printJava() {
        System.out.println(javaExpertise);//prints javaExpertise of Shiwam class
        System.out.println(super.javaExpertise);//print javaExpertise of Shyam class
    }
}

class TestExpertise {
    public static void main(String[] args) {
        Shiwam s = new Shiwam();
        s.printJava();
    }
}



//2.super can be used to invoke parent class method
// The super keyword can also be used to invoke parent class method.
// it should be used if subclass contains the same method as parent class. In other words , it is used if method is overridden.

class Nayma {
    void learned() {
        System.out.println("learned");
    }
}

class Ranjan extends Nayma {
    void learn() {
        System.out.println("learning");
    }

    void practice() {
        System.out.println("practicing");
    }

    void Parallel() {
        super.learned();
        practice();
    }
}

class TestExpertise2 {
    public static void main(String[] args) {
        Ranjan sh = new Ranjan();
        sh.Parallel();
    }
}

//3. super is used to invoke parent class constructor

class Sparsh {
    Sparsh() {
        System.out.println("guiding in android training");
    }
}

class Ghanshyam extends Sparsh {
    Ghanshyam() {
        super();
        System.out.println("supporting parallel");
    }
}

class TestExpertise3 {
    public static void main(String[] args) {
        Ghanshyam s = new Ghanshyam();
    }
}

//Static : in java it is used for memory management mainly. We can apply static keyword with variable, methods, blocks nested classes

//Advantage of static variable is makes program memory efficient
public class Keywords {
    public static void main(String[] args) {

    }

}
