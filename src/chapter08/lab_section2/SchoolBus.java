package chapter08.lab_section2;

public class SchoolBus extends Car{
    @Override
    public void upSpeed(int speed) {
        super.upSpeed(speed);
        if(getSpeed() > 60) {
            setSpeed(60);
        }
    }
}
