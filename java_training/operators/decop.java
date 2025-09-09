/*dec --in decrement  op the val of var decremented by 1
 * classified into 2 types
 * 1.predrec:first dec the value of the var by 1 and the new value assign tothe variable
 * 2.postdec:first read the og val of the var after that it will be decremented by 1
 */
public class decop{
    public static void main(String[] args) {
        int a=10;
        System.out.println(a--);
        System.out.println(--a);
        
    }
}