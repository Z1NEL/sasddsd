public class main {
public static void main(String[] args) {
Shape Shape = new Shape("blue" , true ) ;
Circle Circle = new Circle(14.45 ,"purple" , true );
Rectangle Rectangle = new Rectangle("yellow" , true , 12.5 , 11.69 ) ;
Square Square = new Square ("green" , false , 12.25 , 16.0) ;
    System.out.println(Shape.toString());
    System.out.println(Circle.getArea() + " " + Circle.toString() );
    System.out.println(Rectangle.getArea() + " " + Rectangle.toString());
    System.out.println(Square.getArea() + " " + Square.toString());
}

}
