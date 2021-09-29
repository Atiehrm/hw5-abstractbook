public class UseBook {
    public static void main(String[] args) {
        Book books[] = new Book[10];
        int x;
        books[0] = new Fiction("book1");
        books[1] = new NonFiction("book2");
        books[2] = new Fiction("book3");
        books[3] = new NonFiction("book4");
        books[4] = new Fiction("book5");
        books[5] = new NonFiction("book6");
        books[6] = new Fiction("book7");
        books[7] = new Fiction("book8");
        books[8] = new Fiction("book9");
        books[9] = new Fiction("book10");

        for (x = 0; x < books.length; ++x)

            System.out.println( books[x].getTitle() + " costs " + books[x].getPrice() + " $");
    }
}