package hw5;

public class BookArray {

    public static void main(String[] args) {
        // write your code here
        Book[] books = new Book[10] ;
        for (int i=0 ;i<5;i++){
            books[i]=new Fiction("dastan"+i);
            books[i].setprice();
            System.out.println(books[i].getTitle());
            System.out.println(books[i].getPrice());}

        for (int i=5 ;i<10;i++){
            books[i]=new NonFiction("sher"+(i+1));
            books[i].setprice();
            System.out.println(books[i].getTitle());
            System.out.println(books[i].getPrice());}

}


}
