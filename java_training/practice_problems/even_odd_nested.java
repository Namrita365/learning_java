//pos even or neg,odd pos or neg
import java.util.Scanner;
public class even_odd_nested {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer:");
        int a=sc.nextInt();
        if(a>=0)
        {
             if(a==0)
            {
                System.out.println("pos");
            }
            else if(a%2==0)
            {
                System.out.println("pos even");
            }
            else
            {
                System.out.println("pos odd");
            }
        }
        else if(a<=0)
        {
            if(a%2!=0)
            {
                System.out.println("neg odd");
            }
            else
            {
                System.out.println("neg even");
            }
        }
        sc.close();
    }
}
