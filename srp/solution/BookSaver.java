package srp.solution;

public class BookSaver {
    public void saveToDatabase(BookSRP book){
        System.out.println("Sauvegarde du livre: " + book.getTitle() + " dans la base de données.");
    }

    public void saveToFile(BookSRP book){
        System.out.println("Sauvegarde du livre: " + book.getTitle() + " dans un fichier.");
    }
}
