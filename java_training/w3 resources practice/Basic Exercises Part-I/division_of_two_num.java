//Write a Java program to divide two numbers and print them on the screen.
import java.util.*;
public class division_of_two_num {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a:");
        int a=s.nextInt();
        System.out.println("enter b:");
        int b=s.nextInt();
        System.out.println("division of 2 num:"+a/b);
        s.close();
    }

}
