import java.util.*;

public class BookSorter {
    
    public static Comparator<Book> authorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
    };

    public static Comparator<Book> yearComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            return Integer.compare(b2.getYear(), b1.getYear()); 
        }
    };

    public static Comparator<Book> chainedComparator = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
            int authorCompare = b1.getAuthor().compareTo(b2.getAuthor());
            if (authorCompare != 0) {
                return authorCompare;
            }
            return b1.getTitle().compareTo(b2.getTitle());
        }
    };

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Brave New World", "Aldous Huxley", 1932));

        System.out.println("Books sorted by Title:");
        Collections.sort(books);
        displayBooks(books);

        System.out.println("\nBooks sorted by Author:");
        books.sort(authorComparator);
        displayBooks(books);

        System.out.println("\nBooks sorted by Year:");
        books.sort(yearComparator);
        displayBooks(books);

        System.out.println("\nBooks sorted by Author, then Title:");
        books.sort(chainedComparator);
        displayBooks(books);
    }

    public static void displayBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
