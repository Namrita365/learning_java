import java.util.Scanner;
public class avg_of_three_num{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(avg);
    }
}