public class Rectangle {
    private double hight;
    private double width;

    public Rectangle() {
        this.hight = 0;
        this.width = 0;
    }

    public Rectangle(double hight, double width) {
        this.hight = hight;
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        double area = hight * width;

        return area;
    }
}
