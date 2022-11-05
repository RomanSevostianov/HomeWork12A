public class Main {

    public static void main(String[] args) {


        //создаем объект authorOne типа Author
        Author authorOne = new Author("Ropp", "Serji");
        Author authorTwo = new Author("Nikolay", "Nosov");

        //передаем объект authorOne в качестве параметра конструктора
        Book bookOne = new Book("Roman s kamnem", authorOne, 1985);
        Book bookTwo = new Book("Dunno on the Moon", authorTwo, 1985);

        System.out.println(bookOne.getNameBook() + "  " + bookOne.getYearPublication() + " " + authorOne.getNameAuthor());
        bookOne.setYearPublication(1985);
        System.out.println(bookOne.getNameBook() + "  " + bookOne.getYearPublication() + " " + authorOne.getNameAuthor());
        System.out.println(new Author("Roppd", "sefe"));
        System.out.println(new Book("Dunno on the house", authorOne, 1958));

        System.out.println(bookOne.getYearPublication() + "   " + bookTwo.getYearPublication());

    }
}
