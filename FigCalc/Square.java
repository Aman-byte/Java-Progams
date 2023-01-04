public class Square implements FigCalc {
  private double sideLength;

  public Square(double sideLength) {
    this.sideLength = sideLength;
  }

  @Override
  public double getArea() {
    return sideLength * sideLength;
  }

  @Override
  public double getPerimeter() {
    return sideLength * 4;
  }
}