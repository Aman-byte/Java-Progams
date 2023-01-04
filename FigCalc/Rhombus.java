public class Rhombus implements FigCalc {
  private double sideLength;
  private double angle;

  public Rhombus(double sideLength, double angle) {
    this.sideLength = sideLength;
    this.angle = angle;
  }

  @Override
  public double getArea() {
    return sideLength * sideLength * Math.sin(angle);
  }

  @Override
  public double getPerimeter() {
    return sideLength * 4;
  }
}