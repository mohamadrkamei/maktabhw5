package hw5;

import java.util.Scanner;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress() {
        System.out.println("آدرس را وارد کنید ");
        Scanner scn = new Scanner(System.in);
        address = scn.nextLine();
        for (char c : address.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println(" addres isvalid");
                rate =15;
                break;
            }
            else rate = 0;
        }
               }


    }