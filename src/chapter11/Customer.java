package chapter11;

public class Customer {

    public static void main(String[] args) {

        Product book = new Book();
        book.setPrice(9.99);
        book.setName("Love Story");
        book.setColor("Red");
        ((Book) book).setAuthor("John Brown");
        ((Book) book).setPages(300);
        ((Book) book).setIsbn("abc");
        System.out.println("The book name: " + book.getName());
        System.out.println("The book price: " + book.getPrice());
        System.out.println("The book color: " + book.getColor());
        System.out.println("The book pages: " + ((Book) book).getPages());
        System.out.println("The book author: " + ((Book) book).getAuthor());
        System.out.println("The book isbn: " + ((Book) book).getIsbn());


    }
}
