package Exceptions.HW_2;

public class HW2_Task3 {

    public static void main(String[] args) throws Exception {

        int a = 23;
        int b = 3;
        if (b == 0){
            System.err.println("Что-то пошло не так...На ноль делить нельзя");
        }
        else{
            System.out.println(a / b);
        }
        
        printSum(23, 234);

        int[] abc = { 1, 2 };
        int index = 3;
        if (index > abc.length - 1) {
            System.err.println("Массив выходит за пределы своего размера!");
        }
        else{
            abc[index] = 9;
        }
    }

    public static void printSum(Integer a, Integer b) {
        if(a == null || b == null){
            System.err.println("Указатель не может указывать на null!");
        }
        System.out.println(a + b);
    }   

}
