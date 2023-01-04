public class Main {
  public static void main(String[] args) {
    FigCalc square = new Square(5);
    double area = square.getArea();  // 25
    double perimeter = square.getPerimeter();  // 20

    FigCalc rectangle = new Rectangle(10, 5);
    area = rectangle.getArea();  // 50
    perimeter = rectangle.getPerimeter();  // 30

    FigCalc rhombus = new Rhombus(5, Math.PI / 2);
    area = rhombus.getArea();  // 25
    perimeter = rhombus.getPerimeter();  // 20

    FigCalc triangle = new Triangle(3, 4, 5);
    area = triangle.getArea();  // 6
    perimeter = triangle.getPerimeter();  // 12

    

    System.out.println("Rectangle area: " + rectangle.getArea());
    System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

    System.out.println("Rhombus area: " + rhombus.getArea());
    System.out.println("Rhombus perimeter: " + rhombus.getPerimeter());

    System.out.println("Triangle area: " + triangle.getArea());
    System.out.println("Triangle perimeter: " + triangle.getPerimeter());
  }
}
