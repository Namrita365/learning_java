import java.lang.Math;
public class powers {
        public static void main(String args[])
    {
        int i,n=5,x=2,sum=0;
        for(i=0;i<n;i++){
            sum=sum+(int)Math.pow(x,i);
        }
        System.out.println(sum);

    }
}
