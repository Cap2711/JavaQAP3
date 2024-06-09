public class Square extends Rectangle {
    
    public Square() {
        super(1.0, 1.0); 
    }
    
    public Square(double side) {
        super(side, side); 
    }
    
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side); 
    }

    // Getter and setter for side
    public double getSide() {
        return getWidth(); 
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
    
    // No need to override getArea() and getPerimeter(), calculations are the same as Rectangle
    

    public void setLength(double length) {
        setSide(length);
    }

    
    public void setWidth(double width) {
        setSide(width);
    }
}
