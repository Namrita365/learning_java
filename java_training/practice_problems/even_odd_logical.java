public class even_odd_logical{
    public static void main(String args[])
    {
        int n=-10;
        if(n%2==0 && n>0){
            System.out.println("pos even");
        }
        else if(n%2==0 && n<0){
            System.out.println("neg even");
        }
        else if(n%2!=0 && n<0){
             System.out.println("neg odd");

        }
        else if(n%2!=0 && n>0){
            System.out.println("pos odd");
        }
        else{
             System.out.println("Zero");
        }

    }
}
