public class pattern2 {
    public static void main(String args[]){
        int r,s,n=5;
        for(r=n;r>=1;r--){
            for(s=0;s<n-r;s++){
                System.out.print("  ");
            }
             for(s=0;s<r;s++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
    
}
