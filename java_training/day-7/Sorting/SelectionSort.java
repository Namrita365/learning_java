import java.util.*;
public class selectionSort
{
    public static void main(String args[])
    {
        int a[]={4,2,5,1,0,3};
        int n=a.length;
        for(int s=0;s<n;s++)
        {
        int m=s;
        for(int i=s;i<n;i++)
        {
            if(a[m]>a[i])
            {
                m=i;
            }

        }
        int t=a[s];
        a[s]=a[m];
        a[m]=t;
       }
           System.out.println(Arrays.toString(a));
    }


}

