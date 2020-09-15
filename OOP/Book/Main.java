package book;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Dark August", 448, 2020, new Author("Katie Tallo", 1969));
        Author autor2 = new Author("Attica Locke", 1974);
        Book book2 = new Book("The Cutting Season", 384, 2013, autor2);
        Author autor3 = new Author("Agatha Christie", 1890);
        Book book3 = new Book("The Murder of Roger Ackroyd", 312, 1926, autor3);


        int[] s = {book1.getReleaseYear(), book2.getReleaseYear(), book3.getReleaseYear()};
        Book.sortBook(s);
        System.out.println(autor2.toString());
        System.out.println(book3.toString());
        book1.setReleaseYear(2021);
        System.out.println(book1.getReleaseYear());
        System.out.println(book1.getAutor());
        System.out.println(autor3.getYearOfBirth());
        System.out.println(autor3.getFisrsNameLAstName());

        book1.addBook(book1);
        book2.addBook(book2);
        book3.addBook(book3);
        Book.sort();
    }
}
