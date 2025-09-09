/*logicalop-used to perform logical operation among the operands
 * 1.logical AND(&&)
 * 2.logical OR(||)
 * logical NOT(!)
 */
public class logicalop {
    public static void main(String[] args) {
        int a=40,b=10,c=20;
        System.out.println((a>b)||(c>b));
        System.out.println((a>b)&&(c>b));
        System.out.println(!(a>b));
    }
}
