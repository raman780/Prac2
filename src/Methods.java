// In general method is away to perform some task.
//the method in Java is a collection of instructions that performs a specific task. It provides the reusability of code. We can also easily modify code using methods.
// A method is a block of Code or collection of statements  or a set of code grouped to perform a certain task or operation.
// it is used achieve the reusability of code. We write a method once and use it many times. We do not require write code again and again. it also provides the easy modification and readability of code, just by addiing or removing a chunk of code.

//method signature : every method has a method signature. It is a part of method declaration. it includes the method name and parameter list.
//Access Specifier or modifier is the access type of method. It specifies the visibility of the method. Java Provides four types of Access Specifiers:
//1. public: the method is accessible by all classes when we use public specifier in our application
//2. Private ; When we use a private access specifier, the method is accessible only in the classes in which it is defined.
//3. Protected : When we use protected access specifier , the method is accessible within the package or subclasses in a different package.
//4. Default : When we do not use any access specifier in the method declaration, java uses default access specifier by default. it is visible only from the same package only.

///Return type: Return type is data type that the method returns. It may have a primitive data type, object , collection , void, etc. If the method does not return anything we use void keyword.

//method name : it is a unique name that is used to define the name of a method. it must be corresponding to the functionality of the method. if we are creating a method for substraction of two numbers , the method name must be substraction(). A method is invoked by its name.

// parameter list : it is the list of parameters seperated by a comma and enclosed in the pair of parantheses. It contains the dtat type and variable name.

// method body: it is a part of method declaration. it contains all the actions to be performed. it is enclosed within the pair of curly braces.


import java.util.Scanner;

public class Methods {
}

class EvenOdd {
    public static void main(String[] args) {
        //scanner class object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        //reading value from user
        int num = scan.nextInt();
        //method calling
        findEvenOdd(num);
    }

    public static void findEvenOdd(int num) {
        //method body
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}

//static method : A method that has static keyword is known as static method. in other words, a method that belongs to a class rather than an instance of a class is known as a static method.
// we can also create a static method by using the keyword static before the method name.
// main advantage of static method is that we can call it without creating an object. It can access static data members and also change the value of it. it is used to create an instance method. Ex: main() method

class Display {
    public static void main(String[] args) {
        show();
    }

    static void show() {
        System.out.println("Ex of static method show() ");
    }
}

///instance method : the method of the class is known as an instance method. it is a non -static method defined in the class.
// before calling or invoking the instance method, it is necessary to create an object of its class.

class InstanceMthd {
    public static void main(String[] args) {
        //creating an object of the class
        InstanceMthd obj = new InstanceMthd();
        //invoking instance method
        System.out.println(" the sum is " + obj.add(25, 73));
    }

    int s;

    //user defined method
    public int add(int a, int b) {
        s = a + b;
        //returning the sum
        return s;
    }
}