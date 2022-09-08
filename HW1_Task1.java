package Exceptions;

import java.lang.reflect.Array;

public class HW1_Task1 {
    
    public static void main(String[] args) {
        
        // ArrayIndexOutOfBoundsException
        //int[] myArray = {2,4,6,8,2,7}; 
        //getSum(myArray);

        // ArithmeticException: / by zero
        //getNum(29, 0);
    
        // NullPointerException
        //int[] nextArray = null; 
        //printArray(nextArray);
    }

    public static void getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }


    public static Integer getNum(int a, int b) {
        return a/b;        
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
