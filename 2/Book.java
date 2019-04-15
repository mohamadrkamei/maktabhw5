package hw5;

public abstract class Book {
private String title;
    protected double price;

    public Book(String title) {
        this.title=title;
    }



    public abstract void setprice();
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }

}
