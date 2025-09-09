/*loops
 * 1.while()--exhibition example
 * first it checks the condition if condition is true statements are executed 
 * 2.do-while()
 * 3.for()
 * write a java prg to print sum of digits  of number
 * note:while loop enntry resticted looping statement
 */
public class intro {
    public static void main(String args[]){
        int n=2345,rem,sum=0,temp;
        while(n>0){
            rem=n%10;
            sum=sum+rem;//sum=sum*10+rem
            n=n/10;
        }
        System.out.println("sum is"+sum);

    }
}
