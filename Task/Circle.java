public class Circle extends Shape {

    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double radius(){
        return diameter/2;
    }

    @Override
    public double Area() {
        double area = Math.PI*radius()*radius();
        return area;
    }

    @Override
    public double Perimeter() {
        double per = Math.PI*diameter;
        return per;
    }
}