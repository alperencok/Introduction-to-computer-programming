package Examples;

public class Example01Lab1 {
    public static void main(String[] args) {
        // Take as input the radius of a circle and calculate the total area of the said circle.
        // Print your result on the screen.
        int r=50;
        final double PI=3.14;
        double area;
        area=PI*r*r;
        System.out.println("Area= "+ area);
        System.out.println("Perimeter = "+(2*PI*r));

        int a=2,b=5;
        System.out.println("Area = "+(a*b));
        System.out.println("Perimeter = "+(2*(a+b)));
    }
}
