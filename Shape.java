public class Shape {

    protected String color;
    protected boolean filled;


    public Shape() {
        color = "green";
        filled = true;

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //getters
    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    //setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "Shape" + "[Color: " + color + " Filled: " + filled + "]";
    }
    
}