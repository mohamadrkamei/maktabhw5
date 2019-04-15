package hw5;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fiction fiction=new Fiction("roman");
        NonFiction nonFiction=new NonFiction("shahname");
        System.out.println( nonFiction.getTitle());
        nonFiction.setprice();
        System.out.println(nonFiction.getPrice());
        fiction.setprice();
        System.out.println(fiction.getTitle());
        System.out.println(fiction.getPrice());
    }
}
