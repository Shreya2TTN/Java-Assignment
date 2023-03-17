public class MobilePhone {
    private static MobilePhone instance;
    private MobilePhone(){}
    public static synchronized MobilePhone getInstance(){
        if(instance ==null){
            instance=new MobilePhone();
        }
        return instance;
    }
    public void makeCall(String number){
        System.out.println("Calling "+number);
    }
    public void sendText(String number,String message){
        System.out.println("Sending text to "+number+" "+message);
    }
}
