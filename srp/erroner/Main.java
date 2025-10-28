package srp.erroner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", "Revision");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Thomas");
    }
}
