public class Main {
    public static void main(String[] args) {
        MobilePhone phone= MobilePhone.getInstance();
        phone.makeCall("9843446443");
        phone.sendText("3454567565","Hello, how was your day ?");
        MobilePhone phone2= MobilePhone.getInstance();
        phone2.makeCall("9843454443");
        phone2.sendText("34543467565","Hello, how was your day ?");
    }
}