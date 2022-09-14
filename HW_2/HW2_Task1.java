package Exceptions.HW_2;

import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class HW2_Task1 {
    public static void main(String[] args) {
        getFloatNumber();
    }

    public static void getFloatNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input float number");
        String num = scanner.nextLine();
        while (!isNumeric(num)){
            System.out.println("Not a float number");
            num = scanner.nextLine();
        }       
        System.out.println(num);
        scanner.close();
    }

    private static boolean isNumeric(String num) {
        return num.matches("-?\\d+(\\.\\d+)?");
    }

}
