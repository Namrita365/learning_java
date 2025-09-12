public class p5 {
    public static void main(String args[]){
        int r,s,n=5;
        for(r=n;r>=1;r--){
            for(s=0;s<n-r;s++){
                System.out.print("  ");
            }
             for(s=1;s<r;s++){
                System.out.print(s);
            }
            System.out.println(" ");
        }

    }
}
//try same pattern with numbers
