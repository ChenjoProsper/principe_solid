package srp.solution;

public class Main {
    public static void main(String[] args) {
        BookSRP book = new BookSRP("Titre", "Auteur", "Contenu");
        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic businessLogic = new BookBusinessLogic();

        printer.printToScreen(book);
        printer.printHTML(book);
        saver.saveToDatabase(book);
        saver.saveToFile(book);
        businessLogic.emprunterLivre(book, "Lecteur");
    }
}
