/*
public class Jdkjrejvm {
    // JVM: Java virtual machine is an abstract machine. it is called a virtual machine because it doesn't physically exist.
    // It is a specification that provides a runtime environment in which java byte code can be executed.
    // it can also run those programs which are writen in other languages and compiled to java bytecode.
    // JVM performs the following main tasks;
    //-- loads code
    //-- verifis code
    //-- Executes code
    //-- provides runtime environment

    //JRE is an acronym for java Runtime Environment. it is also written as Java RTE.
    // The java Runtime Environment is a set of software tools which are used for developing Java applications.
    // It is used to provide the runtime environment. it is the implementation of JVM. it physically exists. It contains a set of libraries + other files that JVM uses at runtime.

    //JDK isa an acronym for Java Development Kit.the java Development Kit (JDK ) isa a development environment which is used to develop java applications and applets
    // It physically exists. It contains JRE + development tools.
    // the JDK conatins a private Java virtual machine and a few other resources such as an interpreter/loader (java), a compiler(javac), an archiver(jar) , a documentation generator (javadoc) to complete the development of a java application.

}
*/

public class Jdkjrejvm {
    public static void main(String[] args) {
       /* int value = 3;
        if(value != 1){
            System.out.println("value is 1");
        } else if (value != 2){
            System.out.println("value was 2");
        } else {
            System.out.println("was not 1 or 2");
        }*/

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("value was 2");


            case 3:
                System.out.println("value was 3");


            default:
                System.out.println("value niether fall in 2 or 3 nor fall in 1");

        }
    }
}
