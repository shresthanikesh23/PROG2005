
/**
 * This program is to calculate the area of a circle.
 *
 * @author (Nikesh)
 * @version (28/08/2023)
 */
import java.util.Scanner;
public class CircleArea
{
    // instance variables
    private double radius;
    private double area;

    /**
     * Constructor for objects of class CircleArea
     */
    public CircleArea()
    {
        
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        CircleArea circle1 = new CircleArea();
        circle1.getArea(radius);
    }

    public void getArea(double radius)
    {
        area = radius * radius * 3.14;
        System.out.println("The Circle Area = "+this.area);
    }
}
