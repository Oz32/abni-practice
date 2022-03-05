package Task1;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("HeadFirst Java", "Профессиональная литература");
        Book b2 = new Book("Метро 2033", "Антиутопия");

        Administrator librarianAdmin = new AdministratorLibrarian("Шон");
        ReaderSupplier readerSupplier = new ReaderSupplier("Арман");

        readerSupplier.takeBook(librarianAdmin, b2);
        readerSupplier.takeBook(librarianAdmin, b1);
    }
}