public class Circle extends Shape {
    public double radius = 1.0 ;
    public Circle (){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius , String color , boolean field) {
        super(color, field);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.4*getRadius()*getRadius() ;
    }
    public double Piremetr() {
        return 2*3.14*getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString() +
                '}';
    }
}
