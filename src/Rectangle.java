public class  Rectangle extends Shape {
    public double length = 1.0 , weidth = 1.0 ;

    public Rectangle(double length, double weidth) {
        this.length = length;
        this.weidth = weidth;
    }

    public Rectangle(String color, boolean field, double length, double weidth) {
        super(color, field);
        this.length = length;
        this.weidth = weidth;
    }
    public Rectangle(){

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeidth() {
        return weidth;
    }

    public void setWeidth(double weidth) {
        this.weidth = weidth;
    }
    public double Piremetr() {
        return length + weidth + length + weidth ;
    }
    public double getArea () {
        return weidth * length ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", weidth=" + weidth +
                ", color='" + color + '\'' +
                ", field=" + field +
                '}';
    }
}
