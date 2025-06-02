package chapter07.rabbit;

public class RabbitTest {
    public static void main(String[] args) {

//        Rabbit 클래스에서 rabbit1, 2, 3를 참조변수로 불러와
//        RabbitTest 클래스에서 새 객체를 생성한다.
        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();

//        Rabbit 클래스의 매서드를 rabbit1, 2, 3의 변수로 호출
//        했기 때문에 Rabbit 클래스의 매서드를 사용할 수 있다.
//        이는 Rabbit 클래스의 매서드에 실제 값을 입력한 것이다.

        rabbit1.setShape("분홍네모");
        rabbit2.setShape("갈색세모");
        rabbit3.setShape("파랑동그라미");

        rabbit1.setPosition(50,60);
        rabbit2.setPosition(100,80);
        rabbit3.setPosition(150,80);

        System.out.println(rabbit1);
        System.out.println(rabbit2);
        System.out.println(rabbit3);

        rabbit1.move();
        rabbit2.move();
        rabbit3.move();
    }
}
