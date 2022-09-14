package Exceptions.HW_1;

public class HW1_Task2 {

    public static void main(String[] args) {

        // при добавлении букв
        // NumberFormatException: For input string: "a1"
        // String[][] arrs = {
        // { "a1", "a2", "a3" },
        // { "b1", "b2", "b3" },
        // };

        // при null массиве
        // NullPointerException: Cannot read the array length because "arr" is null
        // String[][] arrs = null;

        String[][] arrs = {
                { "11", "22", "3" },
                { "1", "2", "3" },
        };

        System.out.println(sum2d(arrs));

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // при длине 5
            // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            // for (int j = 0; j < 5; j++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }

        return sum;
    }
}
