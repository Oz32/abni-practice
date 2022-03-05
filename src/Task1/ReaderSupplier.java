package Task1;

public class ReaderSupplier extends User implements Reader, BookSupplier{
    public ReaderSupplier(String name){
        super(name);
    }

    @Override
    public void supplyBook(String book){
        System.out.println("Поставщик " + getName() + "доставил книгу" + book);
    }

    @Override
    public void takeBook(Administrator admin, Book book){
        System.out.println("Поставщик " + getName() + " взял у администратора " + ((User)admin).getName() + "а книгу " + book.getName());
    }

    @Override
    public void returnBook(Administrator admin, Book book){
        System.out.println("Поставщик " + getName() + " вернул администратору " + ((User)admin).getName() + " книгу " + book.getName());
    }
}