package chapter08.section04;

public class PhoneTest {
    public static void main(String[] args) {
//        Phone phone = new Phone(); //인터페이스는 new연산자로 객체 생성 불가능
        TelePhone telePhone = new TelePhone();
        FeaturePhone featurePhone = new FeaturePhone();
        SmartPhone smartPhone = new SmartPhone();

        telePhone.answeringMachine("지금은 전화를 받을 수 없습니다. 음성 메세지를 남겨주세요.");
        telePhone.callPhone("010-1111-1234");
        telePhone.receivePhone("010=2222-1234");

        featurePhone.sendSMS("010-3333-5678", "인터페이스를 배우고 있어요. 아주 많이 사용됩니다.");

        smartPhone.installApp("카카오톡");
    }
}
