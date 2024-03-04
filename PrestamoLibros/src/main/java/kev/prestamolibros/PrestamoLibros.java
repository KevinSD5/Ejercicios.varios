package kev.prestamolibros;

import books.Book;

public class PrestamoLibros {

    public static void main(String[] args) {
        Book book1 = new Book("Harry potter", 5, 25, "fantasia ");
        Book book2 = new Book("El nombre del viento", 1, 28, "fantasia ");
        
    //presto el libro    
        book1.lendbook();
    
        System.out.println(book1.isAvailabel());
        System.out.println(book2.isAvailabel());
        
    }
}
