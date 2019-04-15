package hw5;

public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        priceofthecall=0.02;
    }

    @Override
    public  void information(){
        System.out.println("phone number: "+ getPhoneNumber());
        System.out.println("rate :" + priceofthecall);
        System.out.println("price of the call :" + priceofthecall);
    }
}
