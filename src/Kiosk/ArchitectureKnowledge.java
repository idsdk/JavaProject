package Kiosk;

public class ArchitectureKnowledge extends Knowledge{
    public ArchitectureKnowledge(String title, int price) {
        super(title, price);
    }

    @Override
    public String getDescription() {
        switch (title) {
            case "가로":
                return "도시 내에서 보행자와 차량이 함께 이용하는 도로를 의미합니다. 단순 이동 공간을 넘어 생활 공간, 문화적 교류의 장으로서 중요한 역할을 합니다.";
            case "건축적 산책":
                return "건물을 걸으며 경험하는 일련의 연속적인 공간 체험을 의미합니다.";
            default:
                return "건축학 개념입니다.";
        }
    }
}