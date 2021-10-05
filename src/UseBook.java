public class UseBook {
    public static void main(String[] args) {

        NonFiction nonFiction = new NonFiction("book6");
        System.out.println(nonFiction.getTitle()+nonFiction.getPrice());
        Fiction fiction = new Fiction("book10");
        System.out.println(fiction.getTitle()+fiction.getPrice());

    }
}
