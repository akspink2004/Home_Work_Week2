package instance1;

public class Circle {
    public void multiplication() { // Instance method
        float pi=6.14f;    // Instance variable
        int r = 6; //Instance variable
        float A = pi*r*r; //Instance variable
        System.out.println("Radious of Circle is  = " +A);  // Concetination

    }

    public static void main(String_1[] args) {
        Circle h = new Circle();   // Create object
        h.multiplication(); // Called out Instance method
    }
}
