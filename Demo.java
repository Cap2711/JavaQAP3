public class Demo {

    public static void main(String[] args) {
        
        MovablePoint point = new MovablePoint(3.0f, 4.0f, 1.0f, 2.0f);

        // Print first position
        System.out.println("Initial position: " + point);

        // Move the point
        point.move();

        // Print second position
        System.out.println("New position after moving: " + point);
    }
}
