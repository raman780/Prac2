public class ConstructorOne {
    int id;
    String name;
    int age;

    //creating two arg constructor
    ConstructorOne(int i, String n) {
        id = i;
        name = n;
    }

    //Creating three arg constructor
    ConstructorOne(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }



    public void display() {
        System.out.println(id + "" + name + "" + age);
    }


}
