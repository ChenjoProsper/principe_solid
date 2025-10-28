package srp.solution;

public class BookBusinessLogic {
    public void emprunterLivre(BookSRP book,String lecteur){
        System.out.println("Emprunt du livre: '" + book.getTitle()+ "' par " + lecteur);
    }
}