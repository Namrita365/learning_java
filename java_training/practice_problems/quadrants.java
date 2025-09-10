import java.util.Scanner;
public class quadrants {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==0 && b==0){
            System.out.println("origin");
        }
        else if(a==0){
            System.out.println("y axis");
        }
        else if(b==0){
            System.out.println("x axis");
        }
        else if(a>0 && b>0){
            System.out.println("q1");
        }
        else if(a<0 && b<0){
            System.out.println("q3");
        }
        else if(a<0 && b>0){
            System.out.println("q2");
        }
        else {
            System.out.println("q4");
        }
        sc.close();
    }
}
