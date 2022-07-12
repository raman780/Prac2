// Wrapper class in java provides the mechanism to convert primitive into object and object into primitive
// Uses of wrapper class in Java
// 1. Changing the value in method.
//2. Serialization : We need to convert the objects into streams to perform the serialization. If we have a primitive valu, we can convert it in objects through the wrapper classes.
//3.Synchronization : Java Synchronization works with objects in Multithreading.
//4. java.util.package : The Java.util.package provides the utility classes to deal with objects.
//5. Collection Framework: Java collection Framewotk works with objects only. All classes of the collection framework deal with objects only.


// The eight classes of java.long package are known as wrapper classes in Java. The list of eight wrapper classes are :
// boolean - Boolean
//char - Char
//byte - Byte
//short - Short
//int - Integer
// long - Long
//float - Float
//double - Double

public class WrapperClass {
    private int i;
    WrapperClass(){}
    WrapperClass(int i){
        this.i = i;
    }
    public int getValue(){
        return i;
    }
    public void setValue(int i){
        this.i=1;
    }
    public String toString(){
        return Integer.toString(i);
    }
}

class WrappCls{
    public static void main(String[] args) {
        WrapperClass w = new WrapperClass(25);
    }
}
