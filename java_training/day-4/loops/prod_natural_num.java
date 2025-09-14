import java.util.Scanner;
public class prod_natural_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int i,prod=1;
        for(i=1;i<=n;i++){
            prod=prod*i;
        }
        System.out.println(prod);
        sc.close();
    }
}
