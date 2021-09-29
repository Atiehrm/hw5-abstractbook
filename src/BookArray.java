public class BookArray {
    public static void main(String[] args) {
        Book books[] = new Book[10];
        books[0] = new Fiction("fiction1");
        books[1] = new Fiction("fiction2");
        books[2] = new Fiction("fiction3");
        books[3] = new Fiction("fiction4");
        books[4] = new Fiction("fiction5");
        books[5] = new NonFiction("nonfiction1");
        books[6] = new NonFiction("nonfiction2");
        books[7] = new NonFiction("nonfiction3");
        books[8] = new NonFiction("nonfiction4");
        books[9] = new NonFiction("nonfiction5");
        System.out.println("Details of all the books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ".Name:" + books[i].getTitle());
            System.out.println("Price:$" + books[i].getPrice());
        }
    }
}