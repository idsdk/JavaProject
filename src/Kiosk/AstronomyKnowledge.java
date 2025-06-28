package Kiosk;

public class AstronomyKnowledge extends Knowledge {
    public AstronomyKnowledge(String title, int price) {
        super(title, price);
    }

    @Override
    public String getDescription() {
        switch (title){
            case "별의 탄생":
                return "별은 가스와 먼지로 이루어진 구름인 성운이나 분자운에서 시작되며, 중력 수축으로 중심 온도가 행융합을 시작할 만크 높아지면 원시별이 형성 됩니다.";
            case "Ⅰa형 초신성 폭발":
                return "초신성의 하위 범주로서 백색 왜성이 격렬하게 폭발한 결과물이다. Ⅰa형 초신성은 백색 왜성이 폭발할 임계 질량이 고정되어 있기 때문에 상당히 일정한 최대 광도를 보입니다.";
            default:
                return "천문학 개념입니다.";
        }
    }
}
