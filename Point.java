public class Point {

    protected float x;
    protected float y;

    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        float[] coordinates = {x, y};
        return coordinates;
    }

    // Setters

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
}
