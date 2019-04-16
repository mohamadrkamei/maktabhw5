package hw5;

import java.util.Scanner;

public abstract class NewspaperSubscription {
String name;
String address;
double rate;
    public abstract void setAddress();
    public  void setName(){
        System.out.println("نام را وارد کنید ");
        Scanner scn = new Scanner(System.in);
        name = scn.nextLine();

    }


    public String getname(){
        return name;
    }
    public String getAddress(){
        return  address;
    }

    public  double getRate(){
        return rate;
    }
}
