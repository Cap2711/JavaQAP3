public class Circle extends Shape {
    

    protected double radius;
    
    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius ){
        super(color, filled);
        this.radius = radius;
    }

    //getter

    public double getRadius(){
        return radius;
    }

    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }

        // area and perimeter
    public double getArea() {
        return Math.PI * radius * radius; 
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius; 
    }

    //to string
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
