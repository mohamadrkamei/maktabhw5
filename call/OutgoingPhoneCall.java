package hw5;

public class OutgoingPhoneCall extends PhoneCall {
    double timeOfTheCall;
    public OutgoingPhoneCall(String phoneNumber,double timeOfTheCall) {
        super(phoneNumber);
        this.timeOfTheCall=timeOfTheCall;
        priceofthecall= (0.04)*timeOfTheCall;
    }
    public double getTimeOfTheCall(){
        return  timeOfTheCall;
    }
    @Override
    public  void information(){

        System.out.println("phone number :" + getPhoneNumber());
        System.out.println("price of the call :"+getpriceofthecall());
        System.out.println("time :"+ getTimeOfTheCall());
        System.out.println("total price :" + getpriceofthecall());


    }
}
