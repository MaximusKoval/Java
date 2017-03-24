public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area() {
        double area = length*width;
        return area;
    }

    @Override
    public double Perimeter() {
        double per = length*2 + width*2;
        return per;
    }
}