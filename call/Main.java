package hw5;

public class Main {

    public static void main(String[] args) {
	// write your code here

        IncomingPhoneCall incomingPhoneCall =new IncomingPhoneCall("09120825105");
        incomingPhoneCall.information();
        OutgoingPhoneCall outgoingPhoneCall =new OutgoingPhoneCall("09339661288" ,3.0);
        outgoingPhoneCall.information();
    }
}
