package hw5;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PhysicalNewspaperSubscription physical=new PhysicalNewspaperSubscription();
        physical.setName();
        physical.setAddress();
        System.out.println(physical.getname());
        System.out.println(physical.getAddress());
        System.out.println(physical.getRate());
        System.out.println("--------------------------------------------------");
        OnlineNewspaperSubscription online=new OnlineNewspaperSubscription();
        online.setName();
        online.setAddress();
        System.out.println(online.getname());
        System.out.println(online.getAddress());
        System.out.println(online.getRate());
    }
}
