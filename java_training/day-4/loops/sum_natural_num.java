public class sum_natural_num {
        public static void main(String args[])
    {
        int i,sum=0,n=10;
        System.out.print("sum of natural numbers:");
        for(i=1;i<=n;i++){
            sum=sum+i;
            if(i<n){
                System.out.print(i+"+");
            }
            else{

                System.out.print(i);
            }
            
        }
        System.out.println("="+sum);

    }

}
