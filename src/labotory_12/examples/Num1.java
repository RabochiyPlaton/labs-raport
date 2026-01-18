package labotory_12.examples;

public class Num1 {
    private String title;
    private String author;
    private int pubDate;

    public Num1(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
