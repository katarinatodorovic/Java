package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Book {

    private String title;
    private int numOfPages;
    private int releaseYear;
    private Author author;
    private static ArrayList<Book> knjige = new ArrayList<>();

    public ArrayList<Book> getKnjige() {
        return knjige;
    }

    public void addBook(Book book) {
        if (book != null) {
            knjige.add(book);
        }
    }

    public void removeBook(Book book) {
        knjige.remove(book);
    }

    public static void sort() {
        knjige.sort(Comparator.comparing(Book::getReleaseYear));
        knjige.forEach(System.out::println);

    }

    public Book(String title, int numOfPages, int releaseYear, Author author) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Author getAutor() {
        return author;
    }

    public static void sortBook(int[] yearsOfRelease) {

        for (int i = 0; i < yearsOfRelease.length; i++) {
            for (int j = i; j < yearsOfRelease.length; j++) {
                if (yearsOfRelease[i] > yearsOfRelease[j]) {
                    int temp = yearsOfRelease[i];
                    yearsOfRelease[i] = yearsOfRelease[j];
                    yearsOfRelease[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(yearsOfRelease));
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Name of the Book: ").append(getTitle()).append(" [ ").
                append(getReleaseYear()).append(" ]").append(", number of pages: ").
                append(getNumOfPages()).append(". ").append("\n").append(author);
        return s.toString();
    }
}
