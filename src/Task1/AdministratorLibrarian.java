package Task1;

public class AdministratorLibrarian extends User implements Administrator, Librarian{
    public AdministratorLibrarian(String name){
        super(name);
    }

    @Override
    public void giveBook(Book book){
        System.out.println("Библиотекарь " + getName() + " выдал читателю книгу " + book.getName());
    }

    @Override
    public void notifyOverdue(Reader reader){
        System.out.println("Библиотекарь " + getName() + " уведомил читателя " + ((User)reader).getName() + " об окончании срока аренды книги и о необходимости возврата");
    }

    @Override
    public void orderBook(String book, BookSupplier supplier){
        System.out.println("Библиотекарь " + getName() + " заказал у поставщика " + ((User)supplier).getName() + " книгу " + book);
    }
}