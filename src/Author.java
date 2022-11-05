import java.util.Objects;

public class Author {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getNameAuthor().equals(author.getNameAuthor()) && getSurnameAuthor().equals(author.getSurnameAuthor());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNameAuthor(), getSurnameAuthor());
    }

    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }
public String toString (){
        return nameAuthor+"  "+ surnameAuthor;
}

    public boolean equals (Author nameAuthor){
        if (this.getNameAuthor() == nameAuthor.getNameAuthor())
        {
            return true;
        } else return  false;

    }
}
