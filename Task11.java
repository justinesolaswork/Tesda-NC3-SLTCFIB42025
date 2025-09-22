public class Task11{

    
public static class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    @Override
    public String toString(){
        String message = String.format("Title: %s \nAuthor: %s \nYear Published: %d \n Price: %.2f",title,author,yearPublished,price);
        return message;
    }
}


    public static void main(String[] args) {
        Book literaturebook = new Book();
        literaturebook.title = "Ibong Adarna";
        literaturebook.author = "Jose Rizal";
        literaturebook.yearPublished = 1990;
        literaturebook.price = 200.00;

        System.out.println(literaturebook.toString());
    }

}
