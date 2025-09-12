import java.util.Arrays;

public class copy_iteration {
      public static void main(String args[]){
        int [] a={6,8,4,9,1,3,5};
        int n=a.length;
        int [] b=new int[n-1];
        int k=0;
        for(int num:a){
            b[k++]=num;
        }
        System.out.println(Arrays.toString(b));
    }
}
