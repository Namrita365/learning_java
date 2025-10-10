public class Numbers_using_recursion {
    public static void add(int n){
                        System.out.println(n);
      if(n==10){
            return;
        }

        add(n+1);

    }
    public static void main (String args[]){
        add(1);

    }
}
