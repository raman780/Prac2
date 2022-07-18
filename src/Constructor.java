public class Constructor {
    int id;
    String name;

    //creating a parameterized constructor
    Constructor(int i, String n) {
        id = i;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        //creating objects and passing values
        Constructor s1 = new Constructor(274293, "Raman");
        Constructor s2 = new Constructor(274300, "Arihant");
        //calling method to display the values of objects
        s1.display();
        s2.display();
    }
}
