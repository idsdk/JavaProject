package chapter03;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("BMI Test Program");
        System.out.print("체중(kg)을 입력하세요: ");
        double weight = s.nextDouble();
        System.out.print("키(m)를 입력하세요: ");
        double height = s.nextDouble();

        double bmi = weight / Math.pow(height/100, 2);

        System.out.printf("당신의 체중은 %.2f kg이고 키는 %.2f cm 이므로 BMI지수는 %.2f(kg/m²)입니다.\n", weight, height, bmi);

        s.close();
    }
}
