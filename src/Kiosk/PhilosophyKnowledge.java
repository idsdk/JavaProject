package Kiosk;

public class PhilosophyKnowledge extends Knowledge {
    public PhilosophyKnowledge(String title, int price) {
        super(title, price);
    }

    @Override
    public String getDescription() {
        switch (title) {
            case "존재론":
                return "존재의 본질과 존재의 근본적인 구조를 연구하는 철학의 한 분야입니다.";
            case "니체의 허무주의":
                return "기존의 가치 체계가 붕괴된 상황에서 새로운 가치를 창조하고 삶을 긍정적으로 살아가는 능동적인 태도를 강조하는 철학입니다.";
            default:
                return "철학 개념입니다.";
        }
    }
}