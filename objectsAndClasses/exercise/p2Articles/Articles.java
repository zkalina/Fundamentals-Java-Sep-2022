package objectsAndClasses.exercise.p2Articles;

public class Articles {
    private String title;
    private String content;
    private String author;



    public Articles(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;

    }

    public String edit(String newContent){
        this.content = newContent;
        return newContent;
    }
    public  String changeAuthor(String newAuthor){
        this.author = newAuthor;
        return newAuthor;
    }
    public  String rename (String newTitle){
        this.title = newTitle;
        return newTitle;
    }
    public String toString(){
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

}
