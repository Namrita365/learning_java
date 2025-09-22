//Write a Java program to print 'Hello' on screen and your name on a separate line.
import java.util.*;
public class Hello_and_Name_Printer{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your first name:");
        String fname=s.next();
        System.out.print("Enter your last name:");
        String lname=s.next();
        System.out.println("Hello\n"+fname+" "+lname);
        s.close();
    }
}