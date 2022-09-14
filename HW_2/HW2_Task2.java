package Exceptions.HW_2;


public class HW2_Task2 {
    public static void main(String[] args) {
        
        int[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        int d = 10;

        if (d == 0){
            System.err.println("На ноль делить нельзя");
        }
        else{
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}


 