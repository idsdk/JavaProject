package chapter07.rabbit;

import java.util.Scanner;

public class RabbitLab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rabbit rabbit = new Rabbit();
        int x = 0, y = 0;
        rabbit.setShape("분홍귀요미토끼");

        while(true) {
            System.out.print("토끼가 이동할 x좌표");
            x = sc.nextInt();
            System.out.print("토끼가 이동할 y좌표");
            y = sc.nextInt();

            rabbit.setPosition(x, y);
            rabbit.move();
        }

    }
}
