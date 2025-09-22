import java.util.Scanner;

public class Basic_Arithmetic_Operations {
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a:");
        int a=s.nextInt();
        System.out.println("enter b:");
        int b=s.nextInt();
        System.out.println("sum:"+(a+b));
        System.out.println("Sub of 2 num"+(a-b));
        System.out.println("product of 2 num:"+a*b);
        System.out.println("division of 2 num:"+a/b);
        System.out.println("mod of 2 num:"+a%b);
        s.close();
    }
}
