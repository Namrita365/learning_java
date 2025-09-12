/* */
public class p6 {
    public static void main(String args[]){
        int r,s,n=5;
        for(r=1;r<=n;r++){
            for(s=0;s<n-r;s++){
                System.out.print("  ");
            }
             for(s=1;s<=r;s++){
                System.out.print(s+" ");
            }
                         for(s=r-1;s>0;s--){
                System.out.print(s+" ");
            }
            System.out.println(" ");
        }

    }
}
