/*an if contain another if in it that is known as nested if  */
public class nestedif {
    public static void main (String args[]){
         int a=10,b=5,c=20;
        if (a>b){
            if(a>c){
                System.out.println("a is the largest");
            }

        }
        else {
            if(b>a){
                if(b>c){
                    System.out.println("b is big");
                }
            }
        else
        {
            System.out.println("c is the largest");
        }
    }
}
}

