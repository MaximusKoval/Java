class main {
public static void main(String[]args) {

    Shape circle = new Circle(15);
    Shape rect = new Rectangle(5, 10);

    double circlPer = circle.Perimeter();
    double circlAr = circle.Area();

    double rectPer = rect.Perimeter();
    double rectlAr = rect.Area();

    System.out.println(circlPer);
    System.out.println(circlAr);
    System.out.println(rectPer);
    System.out.println(rectlAr);

    }
}