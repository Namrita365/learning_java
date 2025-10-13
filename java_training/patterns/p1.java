import java.util.*;
public class p1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter n:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* 8");
            }
            System.out.println();
        }


    }
}