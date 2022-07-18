////Exception handling in Java is one af the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
//// normal meaning of exception in java is an abnormal condition
//// Un java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
//// it is a mechanism to handle runtime errors such as ClassNotFoundException, IOException , etc.
//
//// Advantage of Exception handling is to maintain the normal flow of the application. An exception normally disrupts the normal flow of the application, that's why we need to handle exceptions
//// Types of Java exception :
//// 1. Checked Exception : The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. ..Ex : IOException, SQLException .... Checked Exceptions are checked at compile time.
////2. Unchecked Exception: The classes that inherit the RuntimeException are known as unchecked exceptions. Ex: ArithmeticException, NullPointerException.....
////3. Error : Error is irrecoverable.Some ex: of errors are :OutOfMemoryError, VirtualMachineError, AssertionError.......
//
////VVI ----- Java Exception Keywords :
//// Java Provides five keywords that are used to handle the exception.
////----- try : the 'try" keyword is used to specify a block where we should place an exception code. it means we can't use try block alone. The try block must be followed by either catch or finally.
////----- catch: The 'catch' block is used to handle the exception. it  must be preceded by try  block which means we can't use catch block alone. it can be followed by finally block later.
//// ----- finally : the finally block is used to execute the necessary code of the program. it is executed whether an exception is handled or not
//// ----- throw :  the 'throw' keyword is used to throw an exception.
////------ throws : the "throws' keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. it is always used with method signature.
//
//// try catch block : it is used to enclose the code that might throws an exception. It must be used within the method.
////if an exception occurs at the particular statement in the try block, the rest of the block code will not execute. so, it is recommended not to keep the code in try block that will not throw an exception.
//
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.nio.file.AccessDeniedException;
//
//public class HandlingException {
//    public static void main(String[] args) {
//        try {
//            int data = 100 / 0; // may throw exception
//        }
//        // handling the exception
//        catch (ArithmeticException exception) {
//            System.out.println(exception);
//        }
//        System.out.println("rest");
//    }
//}
//
//// Finally block is used to execute important code such as closing the connection, etc.
//// Finally block is always executed whether an exception is handled or not. it contains all the necessary statements that need to be printed regardless of the exception occur or not.
////** Finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
//// The important statements to be printed can be placed in the finally block
//
//class FinallySh {
//    public static void main(String[] args) {
//        try {
//            //below code o not throw any exception
//            int data = 500 / 5;
//            System.out.println(data);
//        }
//        //catch wont be executed
//        catch (NullPointerException exception) {
//            System.out.println(exception);
//        }
//        //executed regardless of exception occurred or not
//        finally {
//            System.out.println(" its always executed");
//        }
//        System.out.println("remaining code");
//    }
//}
//
//// final, finally , finalize are keywords in java that are used in exception handling. Each of these keywords has a different functionality
//// the basic difference is :
//// final is an access modifier
//// finally is the block in Exception Handling
//// finalize is the method of object class
//
//class Finalize {
//    public static void main(String[] args) {
//        Finalize obj = new Finalize();
//        //printing the hashcode
//        System.out.println("Hashcode is : " + obj.hashCode());
//        obj = null;
//        //calling the garbage collector using gc()
//        System.gc();
//        System.out.println("End - garbage collector");
//    }
//
//    //defining the finalize method
////
//    {
//        System.out.println("finalize method is called");
//    }
//}
//
//// throwing an exception in java :
////- In java, exception allows us to write good quality codes where the errors are checked at the compile time instead of runtime and we can create custom exceptions making the code recovery and debugging easier.
//// the java throw keyword is used to throw an exception explicitly.
//// We Specify the exception object which is to be thrown an exception has some message with it that provides the error description.
//// We can throw either checked or unchecked exception in java by throw keyword. it is mainly used to throw a custom exception.
//
//// throwing an unchecked Exception
//
//class Unchecked {
//    //function to check if a person is eligible for employment or not
//    public static void validate(int percentage) {
//        if (percentage < 60) {
//            // throw exception if not eligible to vote
//            throw new ArithmeticException("Person is not eligible for employment!!");
//        } else {
//            System.out.println("Person is eligible for employment!!!");
//        }
//    }
//
//    // main method:
//    public static void main(String[] args) {
//        //calling the function
//        validate(50);
//        System.out.println("rest in peace..........");
//    }
//}
//
////throwing a checked Exception
//
//class Checked {
//    //function to check if person is eligible to vote or not
//    public static void method() throws FileNotFoundException {
//        FileReader file = new FileReader("C:\\Users\\rara274293\\Desktop\\Git tut\\Syllabus for Java.docx");
//        BufferedReader fileInput = new BufferedReader(file);
//
//        throw new FileNotFoundException();
//    }
//
//    //main method
//    public static void main(String[] args) {
//        try {
//            method();
//        } catch (FileNotFoundException exception) {
//            exception.printStackTrace();
//        }
//        System.out.println("rest in peace.........");
//    }
//}
//
//
//
////Throwing a user define exception : throwing a desired exception
//// exception is everything else under the Throwable class.
//
//// class represents user defined exception
//class ShiwamDefinedException extends Exception {
//    public ShiwamDefinedException(String str) {
//        //calling constructor of parent Exception
//        super(str);
//    }
//}
//
////class that uses above MyException
//class ThrowException {
//    public static void main(String[] args) {
//        try {
//            //throw an object of user defined exception
//            throw new ShiwamDefinedException("Altruistic");
//        } catch (ShiwamDefinedException sde) {
//            System.out.println("Caught the loop - hole");
//            //print the message from MyException Object
//            System.out.println(sde.getMessage());
//        }
//    }
//}
//
////Syntax Error : When compiler finds something wrong with our program it throws a syntax error.
////logical Error: A logical error or a bug occurs when a program compiles and runs but does the wrong thing.
////Ex:
////message delivered wrongly
////Wrong time of chats being displayed
////incorrect redirects.
//class Error{
//    public static void main(String[] args) {
//
//    }
//}

public class HandlingException {
    public static void main(String[] args) {
        int i;
        for(i = 1; i<6; i++){
            if(i>3)
                continue;
        }
        System.out.println(i);
    }
}