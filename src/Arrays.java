public class Arrays {
  /*  public static void main(String[] args) {
        double m[] [] = {
                {0*0, 1*0, 2*0, 3*0},
                {0*1, 1*1, 2*1, 3*1},
                {0*2, 1*2, 2*2, 3*2},
                {0*3, 1*3, 2*3, 3*3}
        };
        int i, j;

        for(i=0; i<4; i++){
            for (j=0; j<4; j++)
                System.out.print(m[i] [j] + " ");
            System.out.println();
        }
    }*/

    // this will creates a 3 by 4 by 5, three dimensional array. It then loads eaxh element with the product of its indexes. and it display s three products

    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;

        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    threeD[i][j][k] = i * j * k;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k] + " ");
            }
            System.out.println();


        }
    }
}

//how to declare, instatntiate, initialize and traverse the array
/*
public class Arrays {
    public static void main(String args[]){

        //step by step
//        int a[] = new int[5]; //declaration and instantiation
//        a[0] = 10; //initialization
//        a[1] = 20;
//        a[2] = 30;
//        a[3] = 40;
//        a[4] = 50;

        // doing all process in single line
        int a[] = {10,20,30,40,50};

        //traversing array
        for(int i = 0; i<a.length; i++)// length is the property of array
            System.out.println(a[i]);

        // for each loop
        int arr[] = {10,20,30,40,50};
        //printing array using for- each loop
        for(int i:arr)
            System.out.println(i);
    }

}
*/
//way to passing an array to method
/*class Arrays{
    static void min(int arr[]){
        int min = arr[3];
        for(int i = 2; i<arr.length; i++)
            if(min>arr[i])
                min = arr[i];
        System.out.println(min);
    }

    public static void main(String[] args){
        int a[] = {10,20,30,40,50};//declaring and initializing an array
        min(a); //passing array to method
    }
}*/

//way of passing an anonymous array to method
/*public class Arrays {
    //creating a method which recieves an array as a parameter
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        printArray(new int[]{10, 20, 30, 40, 50}); //passing anonymous array to method
    }
}
*/
/*
// Program to return an array from the method:

class Arrays{
    static int[]get(){
        return new int[]{10,20,30,40,50};
    }
    public static void main(String[] args){
        //calling method which return an array
        int arr[] = get();
        //printing the values of an array
        for(int i = 0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
*/

/*
//demonstrating the case of ArrayIndexOfBoundsException in a Java Array
public class Arrays {
    public static void main(String[] args){
        int arr[] = {50,60,70,80};
        for(int i = 0; i<=arr.length;i++){
            System.out.println(arr[i]);
        }

        }
}
*/

/*
//declaring and using multi dimensional array

class Arrays{
    public static void main(String args[]){
        //declaring and initializing 2-D Array
        int arr[][] = {{1,2,3},{2,4,5},{4,4,5}};
        //printing 2D array
        for(int i = 0; i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/

/*
//Java Ptogram to illustrate the jagged array:

class Arrays{
    public static void main(String[] args){
        //declaring a 2D array with odd Columns
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        //initializing a jagged array
        int count = 0;
        for(int i = 0; i<arr.length;i++)
            for(int j=0; j<arr[i].length;j++)
                arr[i][j] = count++;

        //printing the data of a jagged array
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();//new line
        }
    }
}
*/

/*
//Program to get the class name of array in java
class Arrays{
    public static void main(String[] args){
        //declaration and initialization of an array
        int arr[] = {4,4,5};
        //getting the class name of Java array
        Class c = arr.getClass();
        String name= c.getName();
        //printing the class name of Java array
        System.out.println(name);
    }
}
*/

/*
//Program to copy a source array into destination array in Java
class Arrays{
    public static void main(String[] args){
        //declaring a source array
        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','t','e','d'};
        //declaring a destination array
        char[] copyTo = new char[7];
        //copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        //printing the destination array
        System.out.println(String.valueOf(copyTo));
    }
}
*/

//Program to clone the array
/*class Arrays {
    public static void main(String[] args) {
        int arr[] = {33, 3, 4, 5};
        System.out.println("Printing original array");
        for (int i : arr)
            System.out.println(i);

        System.out.println("Printing clone of the array");
        int carr[] = arr.clone();
        for (int i : carr)
            System.out.println(i);

        System.out.println("Are both equal?");
        System.out.println(arr == carr);
    }
}*/

