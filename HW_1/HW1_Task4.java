package Exceptions.HW_1;
import java.util.Arrays;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух 
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить
//  пользователя. Важно: При выполнении метода единственное исключение, которое пользователь 
//  может увидеть - RuntimeException, т.е. ваше

public class HW1_Task4 {
    
    public static void main(String[] args) {

        int[] firstArray = {10, 8, 6};
        int[] secondArray = {5, 4, 3};
        System.out.println(Arrays.toString(getNewArray(firstArray, secondArray)));
        }

        public static int[] getNewArray (int[] arr1, int[] arr2){
            
            if (arr1.length != arr2.length){
                throw new RuntimeException("Array lengths do not match!");
            }
            else {
                int[] newArray = new int[arr1.length];
                for (int i = 0; i < newArray.length; i++) {
                    newArray[i] = arr1[i] / arr2[i];
                }
                return newArray;
            }
        }

}
