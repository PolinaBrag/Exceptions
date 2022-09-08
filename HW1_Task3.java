package Exceptions;
import java.util.Arrays;

import HomeWork_4.Bread;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
//и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих 
//массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class HW1_Task3 {

    public static void main(String[] args) {
        
    int[] firstArray = {10, 7, 5};
    int[] secondArray = {5, 4, 3, 9, 9};
    System.out.println(Arrays.toString(getNewArray(firstArray, secondArray)));
    }

    public static int[] getNewArray (int[] arr1, int[] arr2){
        
        if (arr1.length != arr2.length){
            System.err.println("Array lengths do not match!");
            if (arr1.length > arr2.length){
                int[] newArray = new int[arr2.length];
                for (int i = 0; i < arr2.length; i++) {
                    newArray[i] = arr1[i] - arr2[i];
                }
            return newArray;
            }
            else {
                int[] newArray = new int[arr1.length];
                for (int i = 0; i < arr1.length; i++) {
                    newArray[i] = arr1[i] - arr2[i];
            }
            return newArray;
            }
            
        }
        else {
            int[] newArray = new int[arr1.length];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arr1[i] - arr2[i];
            }
            return newArray;
        }
    }

}
