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

        //if we print the classloader name of String, it will print null because it is an built in class which is found in rt.jar, so it is loaded by BootStrap loader.
        System.out.println(String.class.getClassLoader());
    }
}*/

/*
Types of variables
*/
class Variables{
    static int valueNo = 1998; //this is static method declared inside class, it cannot be local
    void method(){
        int n = 1998; // this is local variable declared inside this method can be accessed only inside this method
    }

    public static void main(String[] args) {
        int valueOfNumber = 25; // this is instance variable declared inside the class but declared outside the body of method.
        System.out.println(valueOfNumber);
        System.out.println(valueNo);

    }
}
/*Declaring current Age and lapsed as a varaiable and after that just adding it*/
class AddTwoNumbers{
    public static void main(String[] args) {
        int currentAge = 25;
        int lapsedAge = 4;
        int totalAge = currentAge + lapsedAge;
        System.out.println(totalAge);
    }
}

/*Programs to understand which operator gives what output*/
class CheckEveryOperatorOutput{
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
interface ProjectsInPipeline{
    /*here all four non-implemented methods are the abstract methods*/
    void asterixAspice();
    void fordAvdxp();
    void silkProject();
    void learnAndApply();
    void projectContribution();
}

/*now implementing the interface */
/*Creating an abstract class named Elektrobit  which is implementing the interface*/
abstract class Elektrobit implements ProjectsInPipeline{
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

class ElektrobitGermany extends Elektrobit{
    /*overridding the remaining method of the interface and ProjectInPipeline*/
    @Override public void projectContribution(){
        System.out.println("Alligned parallely in pipeline for completion of project till Hypercare and support");
    }
}

//main method

class KnowledgeTransferPhase{
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




