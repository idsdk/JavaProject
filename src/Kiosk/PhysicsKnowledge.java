package Kiosk;

public class PhysicsKnowledge extends Knowledge {
    public PhysicsKnowledge(String title, int price) {
        super(title, price);
    }

    @Override
    public String getDescription() {
        switch (title) {
            case "앤트로피":
                return "정보를 내보내는 근원의 불확실도를 나타내는 양을 뜻합니다.";
            case "양자역학":
                return "아원자 입자와 같은 원자 단위의 미시세계와 그러한 계에서 일어나는 현상을 탐구하는 현대물리학의 한 분야입니다.";
            default:
                return "물리학 개념입니다.";
        }
    }
}