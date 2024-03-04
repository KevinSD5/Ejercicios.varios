package books;

public class Book {
    String title;
    int quantity;
    int id;
    String genre;
    String loanDate;
    String returnDate;
    boolean availabel;

    public Book(String title, int quantity, int id, String genre) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        this.availabel = true;
    }
    
    
    
    public void lendbook() {
        this.availabel = false;
    }
    
    void returnbook(){
        this.availabel = true;
    }

    public boolean isAvailabel() {
        return availabel;
    }

    
}
