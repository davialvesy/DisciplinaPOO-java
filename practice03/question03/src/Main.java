public class Main {
    public static void main(String[] args) throws Exception {
        Rectangle x = new Rectangle();
        Rectangle y = new Rectangle();

        x.setHight(10.3);
        x.setWidth(9);
        x.area();

        y.setHight(17.77);
        y.setWidth(87);
        y.area();

        System.out.printf("Altura de x = %.2f\nLargura de x = %.2f\nÁrea de x = %.2f\n\n", x.getHight(), x.getWidth(), x.area());
        System.out.printf("Altura de y = %.2f\nLargura de y = %.2f\nÁrea de y = %.2f\n\n", y.getHight(), y.getWidth(), y.area());
    }
}
