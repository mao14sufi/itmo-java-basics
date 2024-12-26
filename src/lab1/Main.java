package lab1;

import lab2.Calculator;
import lab2.Planet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
        System.out.println(((46 + 10) * (10.0 / 3)));
        System.out.println(-15 * 29 * 4);
        int number = 10500;
        double result = ((double)number / 10) / 10;
        System.out.println(result);
        result = 3.6 * 4.1 * 5.9;
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        int var3 = scanner.nextInt();
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        int b = scanner.nextInt();
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }


    }
}
