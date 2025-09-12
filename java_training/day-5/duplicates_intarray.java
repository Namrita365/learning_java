import java.util.Arrays;

public class duplicates_intarray {
    
    public static void main(String args[]){
        int [] a={6,6,4,4,9,1,1,3,5};
        Arrays.sort(a);
        int n=a.length;
        int [] dup=new int[n];
        int k=0;
        for(int i=0;i<=n-2;i++){
            if(a[i]==a[i+1]){
                dup[k++]=a[i];
            }
        }
         for(int j=0;j<k-1;j++){
            if(dup[j]!=dup[j+1]){
                System.out.println(dup[j]);
            }
         }
         System.out.println(dup[j]);
    }
}
