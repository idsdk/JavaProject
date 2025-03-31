package chapter02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수1 ==> ");
        int num1 = s.nextInt();

        System.out.print("정수2 ==> ");
        int num2 = s.nextInt();

        int resPlus, resMinus, resMultiply, resDevide, resMod;

        resPlus = num1 + num2;
        resMinus = num1 - num2;
        resMultiply = num1 * num2;
        resDevide = num1 / num2;
        resMod = num1 % num2;

        System.out.printf("%d + %d = %d\n", num1, num2, resPlus);
        System.out.printf("%d - %d = %d\n", num1, num2, resMinus);
        System.out.printf("%d * %d = %d\n", num1, num2, resMultiply);
        System.out.printf("%d / %d = %d\n", num1, num2, resDevide);
        System.out.printf("%d %% %d = %d\n", num1, num2, resMod);
    }
}
