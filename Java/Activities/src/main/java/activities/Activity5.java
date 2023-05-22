package activities;

public class Activity5 {
    public static void main(String[] args) {
        String title = "JAVA FUNDAMENTALS";

        MyBook newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("the title is" + newNovel.getTitle());

    }
}