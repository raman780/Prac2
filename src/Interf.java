// A interface in java is a blueprint of a class. It has static constants and abstract methods
//it isa a mechanism ro achieve abstraction.
//therer can be only abstract methods in  the java interface, not method body. It is used to achieve abstraction and multiple Inheritance.
//interfaces can have abstract methods and variables. it cannot have a method body.
//it cannot be instantiated just like the abstract class.
//reasons to use a Java interface : -
//1. it is used ato achieve abstraction.
//2. By interface, we can support the functionality of multiple inheritance.
//3. it can be used to achieve loose coupling.


interface Upgradable {
    void upgrade();
}

class Management implements Upgradable {
    public void upgrade() {
        System.out.println("upgrading");
    }
}

class Team implements Upgradable {
    public void upgrade() {
        System.out.println("Upgrading Team");
    }
}

public class Interf {
    public static void main(String[] args) {
        Upgradable u = new Team();
        u.upgrade();


    }
}