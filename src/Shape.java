public class Shape {
    public String color = "red" ;
    public boolean field = true ;

     public Shape (){

     }
    public Shape(String color, boolean field) {
        this.color = color;
        this.field = field;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isField() {
        return field;
    }

    public void setField(boolean field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", field=" + field +
                '}';
    }
}
