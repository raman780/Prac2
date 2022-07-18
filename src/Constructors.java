//In Java , A constructor is a block of codes similar to the method. it is called when an instance of the class is created.
// At the time of calling constructor, memory for the object is allocated in the memory.
// it is a special type of method which is used to initialize the object.
//Every time an object is created using the new() keyword, at least one constructor is called.
//It calls default constructor is there is no constructor available in the class. In such case java compiler provides a default constructor by default.
// there are two types of comstructors in java no- arg constructor and parameterized constructor.

//*** It s=is called constructors because it constructs the values at the time of object creation. it is not necessary to write a constructor for a class because java compiler creates a default constructor if our class doesn't have any.

// Rules for Creating a java constructor:
//1. Constructor name must be the same as its class name.
//2. A Constructor must have no explicit return type
//3. A Java constructor cannot be abstract, static, final and synchronized

//A constructor is called default constructor when it doesn't have any parameter.
// purpose of Default constructor : A the default constructor is used to provide the default values to the object like 0, null, etc. depending on the type
//default constructor which displays the default values
public class Constructors {
    int id;
    String name;

    //method to display the value of id and name
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        //creating objects
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors();

        // displaying values of the object
        c1.display();
        c2.display();
    }
}

// In the above code no constructor are created so compiler provides us a default constructor. Here 0 and null values are provided by default constructor.


// A constructor which has specific number of parameters is called a parameterized constructor.
// the parameterized constructor is used to provide different values to distinct objects. We can also provide the same values.
//parameterized constructor
class Em {
    int id;
    String name;

    //creating a parameterized constructor
    Em(int i, String n) {
        id = i;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println("Emp id" + id + " " + "emp name" + name);
    }

    public static void main(String[] args) {
        //creating objects and passing values
        Employee e1 = new Employee(274293, "Raman Ranjan");
        Employee e2 = new Employee(274300, "Arihant Swaminathan");

        //calling method to display the values of object
        e1.display();
        e2.display();
    }
}

//Difference between constructor and method in java
//1. A constructor is used to initialize the state of an object while A method is used to expose the behaviour of an object.
//2. A constructor must not have a return type while A method must have a return type
//3. the constructor is invoked implicitly while the method is invoked explicitly.
//4. the java compiler provides a default constructor if we don't have nay constructor ina class while the method is not provided by the compiler in any case.
//5. The constructor name must be same as the class name while the method name may or may not be same as the class name.

