package labotory_12.books;

public class Num2 {
    protected String title;
    protected String author;
    protected int pubDate;

    public Num2(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}
