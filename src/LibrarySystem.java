import java.util.*;

public class LibrarySystem {
    Map<Book, String> library = new HashMap<>();

    public void addBook(String title, String author, int year, String location) {
        Book book = new Book(title, author, year);
        library.put(book, location);
        System.out.println("Книга добавлена: " + book + " В следующее место в библиотеке: " + location);
    }

    public boolean removeBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        return library.remove(book) != null;
    }

    public String findBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        return library.getOrDefault(book, "Книга не найдена в библиотеке");
    }

    public void printAllBooks() {
        for (Map.Entry<Book, String> entry : library.entrySet()){
            System.out.println("Книга " + entry.getKey() + "года находится на полке: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        LibrarySystem books = new LibrarySystem();

        books.addBook("Война и Мир", "Лев Толстой", 1869, "два");
        books.addBook("За правое дело", "Василий Гроссман", 2024 , "три");
        books.addBook("Бесы. Роман в трёх частях", "Фёдор Достоевский", 2022, "два");

        books.printAllBooks();

        books.findBook("За правое дело", "Василий Гроссман", 2024);

        books.removeBook("За правое дело", "Василий Гроссман", 2024);

        books.findBook("За правое дело", "Василий Гроссман", 2024);

        books.printAllBooks();

    }
}
