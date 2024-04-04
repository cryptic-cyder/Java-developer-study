package Generics;

//Generic class
class Test<T>{

    T obj;

    Test(T obj){
        this.obj = obj;
    }

    public T returnObject(){
        return obj;
    }
}


//Generic class
class Multiple<T,U>{

    T obj1;
    U obj2;

    Multiple(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(obj1+" "+obj2);
    }

}


public class Generics {


    //Generic Method
    public static <T> void printArray(T[] arr){

        for (T item: arr) {
            System.out.print(item+" ");
        }
        System.out.println();

    }

    public static <T extends Number> double calculateAVG(T[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        double sum = 0;
        for (T element : arr) {
            sum += element.doubleValue();
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {

        Test<Integer> test = new Test<Integer>(10);
        System.out.println(test.returnObject());

        Test<String> test1 = new Test<>("Shahriar");
        System.out.println(test1.returnObject());

        Multiple<String , Double> multiple = new Multiple<>("Tanvir", 5.1);
        multiple.print();

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer array: ");
        printArray(intArray);

        String[] stringArray = {"apple", "banana", "orange", "grape"};
        System.out.print("String array: ");
        printArray(stringArray);

        Integer[] intArray1 = {1, 2, 3, 4, 5};
        System.out.println("Average of integer array: " + calculateAVG(intArray1));

        Double[] doubleArray = {3.5, 2.1, 7.8, 4.6};
        System.out.println("Average of double array: " + calculateAVG(doubleArray));
    }
}
