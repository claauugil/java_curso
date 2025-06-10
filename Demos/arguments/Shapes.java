public class Shapes {

    static double getArea(double side_length)
    {
        return (side_length * side_length);
    }
    
    public static void main(String[] args) {
        
        System.out.printf( "The area of the square is: %.2f\n", getArea(2));
        System.out.printf( "The area of the square is: %.2f\n", getArea(2.5));
        System.out.printf( "The area of the square is: %.2f\n", getArea(15));
    }
}
