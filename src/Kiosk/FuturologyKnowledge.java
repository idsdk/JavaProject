package Kiosk;

public class FuturologyKnowledge extends Knowledge{
    public FuturologyKnowledge(String title, int price) {
        super(title, price);
    }

    @Override
    public String getDescription() {
        switch (title) {
            case "포스트휴먼":
                return "기계기술과 유기체적 신체가 결합된 인공지능형 인간입니다. 인간이 아닌 상태에 존재하는 개인이나 실체를 의미합니다.";
            case "특이점":
                return "기술 발전 주요 학문인 정보 공학, 나노 공학, 뇌과학, 인지 과학이 기하급수적으로 발전하여 강 인공지능의 시대가 도래하는 지점입니다.";
            default:
                return "미래학 개념입니다.";
        }
    }
}