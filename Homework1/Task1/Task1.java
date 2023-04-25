//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Homework1.Task1;

import java.util.Scanner;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        int b = 0;
        int c = 1;
        for (int i = 1; i <= a; i++) {
            b = b + i;
            c =  c * i;
        scanner.close();
        }
        System.out.println("Сумма первых n натуральных чисел: " + b);
        System.out.println("Факториал равен: " + c);
    }
}