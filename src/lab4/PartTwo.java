package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class PartTwo {
    public static String methodSortOne(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[i] > ints[j])
                    return "Please,try again";
            }
        }
        return "OK";
    }

    public static void methodSortTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length of array : ");
        int lengthArray = scanner.nextInt();
        int[] ints = new int[lengthArray];
        for (int i = 0; i < ints.length; i++) {
            System.out.print("Enter a value : ");
            ints[i] = scanner.nextInt();


        }
        System.out.println(Arrays.toString(ints));


    }

    public static int[] methodSortThree(int[] ints) {
        int temp = ints[0];
        ints[0] = ints[ints.length - 1];
        ints[ints.length - 1] = temp;
        return ints;
    }

    public static String methodSortFour(int[] ints) {
        String uniqueValue = "there is not unique value in array";
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] == ints[j] && i != j)
                    break;
                else if (j == ints.length - 1)
                    uniqueValue = Integer.toString(ints[i]);

            }


        }
        return uniqueValue;

    }


}


