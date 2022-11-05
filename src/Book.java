import javax.management.loading.PrivateMLet;
import java.util.Objects;

public class Book {
    @Override
    public boolean equals(Object l) { //
        if (this == l) return true;
        if (!(l instanceof Book)) return false;
        Book book = (Book) l;
        return getYearPublication() == book.getYearPublication()
                && getNameBook().equals(book.getNameBook()) && getNameAuthor().equals(book.getNameAuthor());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNameBook(), getNameAuthor(), getYearPublication());
    }

    private String nameBook;
    private Author nameAuthor;
    private int yearPublication;

    //_________________________________________
    public Book(String nameBook, Author nameAuthor, int yearPublication) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    // ___________________________________________
    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }


    //-------------------------------------------------------
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return nameBook + "  " + nameAuthor + "  " + yearPublication;
    }

}

