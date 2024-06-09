public class MovablePoint extends Point {
    
    private float xSpeed;
    private float ySpeed;
    
    public MovablePoint() {
        super();  
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    
    public MovablePoint(float xSpeed, float ySpeed) {
        super();  
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);  
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    // Getters and Setters 
    
    public float getXSpeed() {
        return xSpeed;
    }
    
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    
    public float getYSpeed() {
        return ySpeed;
    }
    
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    // Get and Set speed
    
    public float[] getSpeed() {
        float[] speed = {xSpeed, ySpeed};
        return speed;
    }
    
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    // Move method
    
    public MovablePoint move() {
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        setX(newX);
        setY(newY);
        return this;  
    }
    
    // Override
    
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + "), speed = (" + xSpeed + ", " + ySpeed + ")";
    }
}
