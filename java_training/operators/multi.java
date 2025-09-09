/*more than one availabe but we select one 
 * switch case
 * syntax
 * switch(option)
 * { 
 * case 1:
 *      stmts;
 * break;
 * case 2:
 *      stmts;
 * break;
 * case 3:
 *      stmts;
 * break;
 * ..
 * default:
 * break;}
 * 
 * }
 * day of the week
 * month of the year
 * 
 */
public class multi {
    public static void main(String[] args) {
        int day=4;
        switch(day){
            case 1:
                System.out.println("Mon");
            break;
            case 2:
                System.out.println("Tue");
            break;
            case 3:
                System.out.println("Wed");
            break;
            case 4:
                System.out.println("Thrs");
            break;
            case 5:
                System.out.println("Fri");
            break;
            case 6:
                System.out.println("Sat");
            break;
            case 7:
                System.out.println("Sun");
            break;
            default:
                break;

            

        }

    }
}
