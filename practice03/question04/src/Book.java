public class Book {
    private String tittle;
    private String author;
    private double price;

    public Book() {
        this.tittle = "NoNE";
        this.author = "NoNE";
        this.price = 0;
    }

    public Book(String tittle, String author, double price) {
        this.tittle = tittle;
        this.author = author;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String applyDiscount() {
        // Ideia Pedro: Converter o valor resultante em string.
        if(price > 150) {
           return  "Preço com Desconto: " + String.valueOf(price-(price*0.15));
        }else {
            return "Esse produto não recebe desconto.";
        }
    }

    public void showInfo() {
        System.out.printf("Autor: %s\nTítulo: %s\nPreço: %s\n%s\n\n", author, tittle, price, applyDiscount());
    }
}
