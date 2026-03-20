public class Main {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book();
        Book b2 = new Book();


        b1.setAuthor("Andrzej Sapkowski");
        b1.setTittle("The Witcher");
        b1.setPrice(250);

        b2.setAuthor("George Lucas");
        b2.setTittle("Star Wars");
        b2.setPrice(150);

        b1.showInfo();
        b2.showInfo();
    }
}
