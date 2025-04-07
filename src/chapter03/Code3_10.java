package chapter03;

import java.util.Scanner;

public class Code3_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score;

        System.out.println("운전자 합격 조회 프로그램");
        System.out.print("점수를 입력하시오: ");
        score = s.nextInt();

        if (score >=70)
            System.out.println("합격입니다.");
        else
            System.out.println("불합격입니다.");
        s.close();

    }
}
