//Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.*;
public class multiplication_table {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        s.close();
    }
}
