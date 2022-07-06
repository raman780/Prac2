//1st class
class SingletonClass {
    //static variable refrence of single_instance of type Singleton
    private static SingletonClass single_instance = null;

    //declaringa variable of type String
    public String s;

    //creating private constructor restricted to this class itself
    private SingletonClass() {
        s = "Hi, I'm a string part of SingletonClass";
    }

    //static method to create instance of singleton class
    public static SingletonClass getInstance() {
        if (single_instance == null)
            single_instance = new SingletonClass();
        return single_instance;
    }
}

//2nd class
class Single {
    // main method
    public static void main(String[] args) {
        //instantiating SingletonClass with variable a
        SingletonClass a = SingletonClass.getInstance();

        ////instantiating SingletonClass with variable b
        SingletonClass b = SingletonClass.getInstance();

        ////instantiating SingletonClass with variable c
        SingletonClass c = SingletonClass.getInstance();

        //printing the hashCode for above variable as declared
        System.out.println("Hashcode of a is " + a.hashCode());
        System.out.println("Hashcode of b is " + b.hashCode());
        System.out.println("hashcode of c is " + c.hashCode());

        //condition Check

        if (a == b && b == c) {
            //print statement

            System.out.println("These three objects point to the same memory location on the heap, i.e to the same object");
        } else {
            //print statement
            System.out.println("Theree objects don't point to the memory location on the heap");
        }
    }
}




