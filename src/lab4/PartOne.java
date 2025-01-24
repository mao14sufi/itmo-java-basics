package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class PartOne {
    public static void methodOne() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public static void methodTwo() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Делится на 3 и 5 : " + i);
            else if (i % 3 == 0)
                System.out.println("Делится на 3 : " + i);
            else if (i % 5 == 0)
                System.out.println("Делится на 5 : " + i);


        }

    }
    public static boolean methodThree(int number1, int number2, int number3 ){
        boolean isTrue = (number1 + number2 == number3);
        return isTrue;

    }
    public static boolean methodFour(int number1, int number2, int number3){
        boolean isTrue = (number2 > number1) && (number3 > number2);
        return isTrue;
    }
    public static boolean methodFive(int[] ints){

            boolean isTrue = (ints[0] == 3 || ints[ints.length - 1] ==3);
            return isTrue;


    }
    public static boolean methodSix(int[] ints){

        for (int value : ints) {
            if (value == 1 || value == 3)
                return true;
        }
        return false;




    }

}

