import java.util.*;
public class pos_neg {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        if(a>=0){
            System.out.println("a is postive");
        }
        else if(a<=0){
            System.out.println("a is neg");
        }
        else{
            System.out.println("zero");
        }
        sc.close();
    }
    
}
