package chapter07.access;

public class RabbitTest {
    public static void main(String[] args) {
        RabbitPrivate r1 = new RabbitPrivate();
        r1.setShape("Rectangle");
        r1.setPosition(50, 100);
        System.out.println("토끼 모양: " + r1.getShape());
        System.out.printf("토끼 현재 위치: (" + r1.getX() + ", " + r1.getY() + ")");
    }
}
