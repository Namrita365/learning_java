public class sum_of_NAt {
    public static void nn(int n)
    {
        int sum=0;
        if(n==10){ 
            sum=sum+n;
            return ;
        }
        nn(n+1);

    }
    public static void main(String[] args) {
        nn(1);
    }
}
