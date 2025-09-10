import java.util.*;
public class same_different {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x and y:");
        int x=sc.nextInt(),y=sc.nextInt();
        if(x==y){
            System.out.println("same");
        }
        else{
            System.out.println("different");
        }
        sc.close();
    }
    
}
