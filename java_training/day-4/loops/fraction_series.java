public class fraction_series {
        public static void main(String args[])
    {
        int i,n=5,sum=0;
        for(i=0;i<n;i++){
            sum=sum+(i/(i+1));
        }
        System.out.println(sum);

    }
}
