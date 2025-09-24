import java.lang.Math;
public class powers1{
        public static void main(String args[])
    {
        int i,n=5,x=2,sum=0;
        for(i=0;i<n;i++){
            if(i%2==0){
                sum=sum+(int)Math.pow(x,i);
            }
            else{
                sum=sum-(int)Math.pow(x,i);
            }
            
        }
        System.out.println(sum);

    }
}
