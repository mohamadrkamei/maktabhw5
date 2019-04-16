package hw5;

public abstract class PhoneCall {
String phoneNumber;
double priceofthecall;
public  PhoneCall(String phoneNumber){
    this.phoneNumber=phoneNumber;
    priceofthecall=0.0;
}
public String getPhoneNumber(){
    return phoneNumber;
}
public Double getpriceofthecall(){
    return priceofthecall;
}

public abstract void information();


}
