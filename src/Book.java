import javax.management.loading.PrivateMLet;

public class Book {
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
    public  int getYearPublication(){
        return this.yearPublication;
    }


    //-------------------------------------------------------
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

