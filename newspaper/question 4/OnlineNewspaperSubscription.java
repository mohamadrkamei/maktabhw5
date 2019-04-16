package hw5;

import java.util.Scanner;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress() {
        System.out.println("ایمیل خود را وارد کنید");
        Scanner scn = new Scanner(System.in);
        address = scn.nextLine();
        if (address.contains("@")) {
            System.out.println(" email is not valid");
            rate = 9;
        } else {
            rate = 0;
        }
    }


}
