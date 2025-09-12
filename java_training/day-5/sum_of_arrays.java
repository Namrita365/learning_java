public class sum_of_arrays {
    public static void main(String args[]){
        int i,sum=0, n=5;
        int a[]={1,2,3,4,5};
        for(i=0;i<n;i++){
            sum=sum+a[i];
            System.out.println(a[i]);
        }
        System.out.println(sum);
    }
}
