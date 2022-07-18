//public class EvenOdd {
//    public static void main(String[] args){
//        //creating Scanner class object
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the number");
//        //reading value from the user
//        int num = scan.nextInt();
//        //method calling
//        Pra3.findEvenOdd(num);
//    }
//}

public class EvenOdd {
    public static void main(String[] args) {

    }

    //user defined method
    public static void findEvenOdd(int num) {
        //method Body
        if (num % 2 == 0)
            System.out.println(num + " is even ");
        else
            System.out.println(num + " is odd");
    }
}
