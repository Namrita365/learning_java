//Write a Java program to print the area and perimeter of a circle.
import java.util.*;
public class Area_and_Perimeter_of_circle {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double radius=s.nextDouble();
        double area=Math.PI*radius*radius;
        double perimeter=2*Math.PI*radius;
        System.out.println(area);
        System.out.println(perimeter);
        s.close();

    }
}
