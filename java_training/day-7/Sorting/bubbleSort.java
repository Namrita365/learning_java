/*
5 7 3 2 1 6
pass1
5 3 7 2 1 6
5 3 2 7 1 6 
3 5 2 7 1 6
3 2 5 7 1 6
2 3 5 7 1 6
2 3 5 1 7 6
2 3 1 5 7 6
2 1 3 5 7 6
1 2 3 5 7 6 
1 2 3 5 6 7 
worst case time complexity:o(n^2)
online java visualize
*/
import java.util.*;
public class bubbleSort
{
    public static void main(String args[]){
        int a[]={4,3,1,0,5,2};
        int n=a.length;
        for(int s=0;s<n;s++){
            for(int i=0;i<n-s;i++){

                if(a[i]>a[i+1]){
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        
    }
}