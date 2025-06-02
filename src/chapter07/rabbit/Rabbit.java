package chapter07.rabbit;

public class Rabbit {
//    속성: 모양, x, y
//    필드 == 변수
//    이 클래스에서 만든 매서드들을 RabbitTest에서 참조변수로 불러와
//    Rabbit클래스의 매서드와 필드를 사용할 수 있다.

    private String shape;
    private int x;
    private int y;

    public Rabbit() {
        shape = "기본토끼";
        x = 30;
        y = 30;
    }

//    지역변수의 필드를 불러 올 때는 this.필드 이고 매개변수를 불러올 때는
//    그냥 매개변수를 쓰면 된다.
    public Rabbit(String shape, int x, int y) {
        this.shape = shape;
        this.x = x;
        this.y = y;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    이동하다(기능)
    public void move() {
        System.out.println("토끼가 ( "+ x +", "+ y +")좌표로 이동한다.");
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "shape='" + shape + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
