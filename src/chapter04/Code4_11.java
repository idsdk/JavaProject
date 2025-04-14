package chapter04;

import java.util.Scanner;

public class Code4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an decimal number1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter an decimal number2 : ");
        String str2 = sc.nextLine();

        int diffNum = str1.length() - str2.length();
        System.out.println("number1 And number2 difference number : " + diffNum);
        sc.close();
    }
}
