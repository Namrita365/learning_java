import java.util.*;
public class smallest_of_3_num{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter three numbers (separated by space): ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double smallest=Math.min(a,Math.min(b,c));
        System.out.println("the smallest num is "+smallest);
    }
}