package SESSION10.SESSION10_04;

public class Main {
    public static void main(String[] args) {
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        System.out.println("=== HỆ THỐNG NHÀ THÔNG MINH ===");

        smartLight.powerOn();
        smartLight.checkBattery();
    }
}