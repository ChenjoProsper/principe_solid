package srp.erroner;

public class Book {
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content){
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

    public void printToScreen(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Content: "+this.content);
    }

    public void saveToDatabase(){
        System.out.println("Sauvegarde du livre: "+this.title+" dans la base de données.");
    }

    public void emprunter(String lecteur){
        System.out.println("Emprunt du livre: "+this.title+" par "+lecteur);
    }

}
