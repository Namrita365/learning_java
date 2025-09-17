import java.util.*;
public class Insertionsort {
    public static void main(String args[]){
        int a[]={5,8,6,9,4,2,3,1};
        int n=a.length;
        for(int k=1;k<n;k++){
            int key=a[k];
            int s=k-1;
            while(s>=0&&a[s]>key){
                a[s+1]=a[s];
                s--;
            }
                 a[s+1]=key;
        }
   
        System.out.println(Arrays.toString(a));
    }
}
