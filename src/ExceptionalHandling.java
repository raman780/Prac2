public class ExceptionalHandling {
    public static void main(String[] args) {
        int[] ints = new int[5];
        try {
            //code that may raise exception
            //int data = 100/0;
            //String s = null;
            //System.out.println(s.length());
//            String s= "abc";
//            Integer integer = null;
//            int i = integer.parseInt(s);
            int a[] = new int[5];
            a[10] = 50; //
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println(new int[5]);
        }
        //rest code of the program
        System.out.println("rest of the code");


    }
}


class ExceptionalHandling1 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throws exception

        }
        //handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}


// here as we can see if the exception occurs in the try block then the rest of the code will not execute
class ExceptionalHandling2 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;//may throw exception if exception occurs the remaining statement will not execute
            System.out.println("rest of the code");
        }
        //hadling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}


//handling the exception using the parent class exception
class ExceptionalHandling3 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0;// may throw exception
        }
        //handling the exception by using Exception class
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}


//printing a customed desired message on exception
class ExceptionalHandling4 {
    public static void main(String[] args) {
        try {
            int data = 100 / 0; // may throws exception
        }
        //handling the exception using catch block
        catch (Exception e) {
            //displaying the custom message
            System.out.println("Can't divided by zero");
        }
        System.out.println("Hello exception HANDLED");
    }
}


//RESOLving the exception in catch block

class ExceptionalHandling5 {
    public static void main(String[] args) {
        int i = 500;
        int j = 0;
        int data;
        try {
            data = i / j;//may throw exception
        }
        //handling the excdeption in catch block
        catch (Exception e) {
            //resolving the exception in catch block
            System.out.println(i / (j + 2));
        }

    }
}


class ExceptionalHandling6 {
    public static void main(String[] args) {
        try {
            int a[] = new int[10];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithemetic Exception Ocuurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayOutOfIndexException");
        } catch (Exception e) {
            System.out.println("parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}