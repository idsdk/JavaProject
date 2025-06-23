package chapter08.section02;

public class MountainRabbit extends Rabbit {
    String mountainName;

    public MountainRabbit() {
        super();
        System.out.println("3. MountainRabbit의 생성자가 실행됨.");
    }

    void eatWildglass(){
        System.out.println("산토끼가 밥을 먹어요.");
    }

    public void run() {
    }
}
