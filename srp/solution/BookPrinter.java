package srp.solution;

public class BookPrinter {
    public void printToScreen(BookSRP book){
        System.out.println("===Print to Screen===");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Content: " + book.getContent());
    }

    public void printHTML(BookSRP book){
        System.out.println("===Print to HTML=== ");
        System.out.println("<html>");
        System.out.println("<head><title>" + book.getTitle() + "</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Author: " + book.getAuthor() + "</h2>");
        System.out.println("<p>" + book.getContent() + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}