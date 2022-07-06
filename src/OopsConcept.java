//Object : Any entity that has state and behaviour is known as an object.
//EX: A dog is an object because it has states like colour, name, breed, etc. as well as behaviour line wagging the tail , barking , eating etc.

//Class: Collection ob onject is called class. It is logical entity (Logical entities represent "things" consumed or produced by logical activities)
//A class can also be defined as  a blueprint from which we can create an individual object. Class doesn't consume any space.
// A class in java can contain : fields, methods, constructors, blocks, Nested class and interface
class OopsConcept1 {
    int id = 274293;
    String name = "Raman Ranjan";
}

//Inheritance: When One object acquires all the properties and behaviors of a parent object, it is known as inheritance. it provides code reusability. it is used to achieve runtime polymorphism.
// used for code reusability

//polymorphism: If one task is performed in different ways, it is known as polymorphism. Ex : to convince the customer differently to draw something. for example, shape, triangle, etc.
//there are two types of polymorphism in java : compile time and Runtime polymorphism
//we can perform polymorphism in java by method overloading and method overriding

//Abstraction : hiding internal details and showing functionality is known as abstraction. Ex: phone Call , we don't know the internal processing.
//in java We use abstract class and interface to achieve abstraction.
//Abstract class : A class which is declared as abstract is known as an abstract is known as an abstract class. it needs to be extended and its method implemented. it cannot be instantiated.
//important points for abstract class
//An abstract class must be declared with an abstract keyword
// it can have abstract and non -abstract methods.
//It cannot be instantiated.
// it can have constructors and static methods also.
//it can have final methods which will force the subclass not to change the body of the method.




//Encapsulation: Binding or wrapping code and data together into a single unit are known as Encapsulation. Ex: A capsule, it is  wrapped with diff medicines.
//A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here.
//Advantages of Encapsulation in java:
// By provoding only a setter and geter method , we can make the class read only or write only. in other words, we can skip the getter or setter methods.
//it provides us the control over the datat.
// it is the way to achieve data hiding in java because other class will not be able to access the data through the private data members.
// the encapsulate class is easy to test. So, it is better for unit testing.


//Coupling : it refers to the knowledge or information or dependency of another class. it arises when classes are aware of each other. If a class has the detailed information of another class, there is strong coupling. in java, we use private, protected and public modifiers to display the visibility level of a class, method and field. we can use interfaces for the weaker coupling there is no concrete implementation.

//Cohesion: Cohesion refers to the level of a component which performs a single well-defined task is done by highly cohesive method. the weakly cohesive method will split the task into seperate parts.
// the java.io package is a highly cohesive package because it has I/O related classes and interface. however, the java.util package isa weakly cohesive package because it has unrelated classes and interfaces.

//Association : Association represent the relationship between the objects. here One object can be associated with one object or many objects.
// there can four types of associations between the objects
// One to one
// one to many
//many to one
//many to many

//Aggregation : Aggregation is a way to achieve Association. Aggregation represents the relationship where one object contains other objects as a part of its state. it represents the weak relationship between objects. it is also termed as a has-a relationship in java. Like inheritance represents the is -a relationship. It is another way to reuse objects.

//Composition: The composition is also a way to achieve Association. the composition represents the relationship where one object contains other objects as a part of its state. there is a strong relationship between the containing object and the dependent object.
// it is the state where containing objects do not have an independent existence. if we delete the parent object, all the child objects will be deleted automatically.

class OopsConcept2 {
    public static void main(String[] args) {
        OopsConcept1 E1 = new OopsConcept1();
        System.out.println("Emp ID :" + E1.id);
        System.out.println("Emp Name :" + E1.name);
    }
}

class Emp {
    float salary = 200000;
}

class Programmer extends Emp {
    int bonus = 300000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("programmer salary is : " + p.salary);
        System.out.println("bonus of Programmer is : " + p.bonus);
    }
}

//Single Inheritance : When a class inherits another class, it is known as single inheritance.
class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}

class Inherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}

//multilevel inheritance : When there is a chain of inheritance. it is known as multilevel inheritance.
class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
}

class MultiInherit {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}

//hierarchical inheritance : When two or more classes inherits a single class, it is known as hierarchical inheritance.
class Cat extends Animal {
    void meow() {
        System.out.println("meowing");
    }
}

class HierarchicalInherit {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}

//Runtime polymorphism or Dynamic Dispatch method is a process in which a call to an overridden method is resolved at runtime rather than compile time.
class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class Hdfc extends Bank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class Kotak extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.3f;
    }
}

class Sbi extends Bank {
    @Override
    float getRateOfInterest() {
        return 9.1f;
    }
}

class Poly {
    public static void main(String[] args) {
        Bank b;
        b = new Sbi();
        System.out.println("SBI rate of Interest : " + b.getRateOfInterest());
        b = new Kotak();
        System.out.println("kotak rate of interest : " + b.getRateOfInterest());
        b = new Hdfc();
        System.out.println("Hdfc rate of Interest : " + b.getRateOfInterest());
    }
}

//Abstraction through abstract class

abstract class Bike {
    abstract void run();
}

class Kawasaki extends Bike {
    @Override
    void run() {
        System.out.println("running safe");
    }

    public static void main(String[] args) {
        Bike obj = new Kawasaki();
        obj.run();
    }
}

abstract class Shape {
    abstract void draw();
}

//In real scenario, implementation is provided by others i.e unknown by end user
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing circle");
    }
}
// In real Scenario method is called by programmer or user

class Abstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

//Encapsulation

// A Account class which is fully encapsulated class.
//it has private data members and getter and setter methods

class Account {
    //private data members
    private long acc_no;
    private String name, email;
    private float amount;

    //public getter and setter methods

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

// A java class to test the encapsulated class Account

public class OopsConcept {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc = new Account();
        //setting values through setter methods
        acc.setAcc_no(12345678L);
        acc.setName("Raman");
        acc.setAmount(50000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getAmount());
    }
}