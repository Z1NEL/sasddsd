public class Square extends Rectangle {
    public Square(double length, double weidth) {
        super(length, weidth);
    }

    public Square(String color, boolean field, double length, double weidth) {
        super(color, field, length, weidth);
    }

    public Square() {
    }
    public double getSide () {
     return weidth ;
    }
    public void Side (double Side) {
        weidth = Side ;
        length = Side ;
    }

    @Override
    public void setWeidth(double Side) {
        weidth = Side ;
    }
    public void Setlength (double Side){
        length = Side ;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
