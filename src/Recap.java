//Practical revise of all concepts of java

/*
public class Recap {
    public static void main(String[] args) {

    }
}
*/
/*This program will print the classloader name*/
/*class ClassLoaderExample{
    public static void main(String[] args) {
        //prints the classloader name of current class
        //Application/System classloader will load this class
        Class c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());

        //if we print the classloader name of String, it will print null because it is an built-in class which is found in rt.jar, so it is loaded by BootStrap loader.
        System.out.println(String.class.getClassLoader());
    }
}*/

import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;

/*
Types of variables
*/
class Variables {
    static int valueNo = 1998; //this is static method declared inside class, it cannot be local

    void method() {
        int n = 1998; // this is local variable declared inside this method can be accessed only inside this method
    }

    public static void main(String[] args) {
        int valueOfNumber = 25; // this is instance variable declared inside the class but declared outside the body of method.
        System.out.println(valueOfNumber);
        System.out.println(valueNo);

    }
}

/*Declaring current Age and lapsed as a variable and after that just adding it*/
class AddTwoNumbers {
    public static void main(String[] args) {
        int currentAge = 25;
        int lapsedAge = 4;
        int totalAge = currentAge + lapsedAge;
        System.out.println(totalAge);
    }
}

/*Programs to understand which operator gives what output*/
class CheckEveryOperatorOutput {
    public static void main(String[] args) {
        int e = 20;
        System.out.println(e++); // ++ after expression... it is a postfix category falling under unary operator
        System.out.println(++e);// ++ before expression.... it is a prefix category falling under unary
        System.out.println(e--);//-- after expression.... it is a prefix category falling under unary
        System.out.println(--e);// -- before expression.... it is a prefix category falling under unary
    }
}




/*implementing interface using abstract class in java*/

/*creating an interface named ProjectInPipeline*/
interface ProjectsInPipeline {
    /*here all four non-implemented methods are the abstract methods*/
    void asterixAspice();

    void fordAvdxp();

    void silkProject();

    void learnAndApply();

    void projectContribution();
}

/*now implementing the interface */
/*Creating an abstract class named Elektrobit which is implementing the interface*/
abstract class Elektrobit implements ProjectsInPipeline {
    /*Overriding methods of the interface */

    @Override
    public void asterixAspice() {
        System.out.println("phase 2 enhancements Starting after some months");

    }

    @Override
    public void fordAvdxp() {
        System.out.println("starting after few months");
    }

    @Override
    public void silkProject() {
        System.out.println("Starting after few months");
    }

    @Override
    public void learnAndApply() {
        System.out.println("learning and will apply after project starts");
    }
}

/*creating an non-abstract class ElektrobitGermany which is extending Elektrobit*/

class ElektrobitGermany extends Elektrobit {
    /*overridding the remaining method of the interface and ProjectInPipeline*/
    @Override
    public void projectContribution() {
        System.out.println("Alligned parallely in pipeline for completion of project till Hyper care and support");
    }
}

//main method

class KnowledgeTransferPhase {
    public static void main(String[] args) {
        /*new object of ElektrobitGermany is created*/
        ElektrobitGermany ebG = new ElektrobitGermany();

        /* calling multiple functions*/

        ebG.asterixAspice();
        ebG.fordAvdxp();
        ebG.silkProject();
        ebG.projectContribution();

    }
}


/*Control flow statement practices ......Decision making/Loop Statements/Jump Statements*/

class Age {
    public static void main(String[] args) {
        int ageOfRaman = 25;
        int ageOfAman = 25;
        if (ageOfAman + ageOfRaman < 45) {
            System.out.println("Age is 25");
        }
    }
}

/*Java Inner class or nested classes*/

/*Java Inner class or nested class is a class that is declared inside the class or interface.*/

/*Advantages of Nested classes*/
//1 Nested classes represent a particular type of relationship that is it can access all the members and methods of the outer class, including private.


class Ram{
    public static void main(String[] args) throws IOException {
        String[] fileNmaes = {"file.html", "file2.txt"};
        BufferedWriter writer = null;
        for(int i= 0; i<fileNmaes.length; i++){
            System.out.printf("%d\n", i);
            writer = new BufferedWriter(new FileWriter(fileNmaes[i]));
            writer.write("Java is Object Oriented programming language");
            writer.close(); ///// this will flush BufferedWriter
        }
    }
}








