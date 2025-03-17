package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("model: " + myPhone.model);
        System.out.println("color: " + myPhone.color);
        System.out.println("wifi state: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("hello~?");
        myPhone.receiveVoice("Hi!");
        myPhone.sendVoice("Ah~ 예");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
