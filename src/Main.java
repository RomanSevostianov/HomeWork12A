public class Main {

    public static void main(String[] args) {


        //создаем объект authorOne типа Author
        Author authorOne = new Author("Ropp", "Serji");
        Author authorTwo = new Author("Nikolay", "Nosov");

        //передаем объект authorOne в качестве параметра конструктора
        Book bookOne = new Book("Roman s kamnem", authorOne, 1985);
        Book bookTwo = new Book("Dunno on the Moon", authorTwo, 1965);

        System.out.println(bookOne.getNameBook() + "  " + bookOne.getYearPublication() + " " + authorOne.getNameAuthor());
        bookOne.setYearPublication(1966);
        System.out.println(bookOne.getNameBook() + "  " + bookOne.getYearPublication() + " " + authorOne.getNameAuthor());

    }
}
