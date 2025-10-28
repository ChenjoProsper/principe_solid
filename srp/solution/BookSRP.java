package srp.solution;

public class BookSRP {
    private String title;
    private String author;
    private String content;

    public BookSRP(String title, String author, String content){
        this.title = title;
        this.author = author;
        this.content = content;
    }
    
    public String getTitle(){ 
        return this.title;}
    public String getAuthor(){
        return this.author;
    }
    public String getContent(){
        return this.content;
    }
}
