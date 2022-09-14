package Exceptions.HW_2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя

public class HW2_Task4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scanner.nextLine();
        if (text.isEmpty()){
            throw new NullPointerException("Пустые строки вводить нельзя!");
        }
        scanner.close();
        System.out.println("Ваш текст: " + text);
        
    }
}
