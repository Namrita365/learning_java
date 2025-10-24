class Dog{
    public void bark(){
        System.out.println("it barks");
    }
}
class puppy  extends Dog{
    public void sleep(){
        System.out.println("puppy sleeping");

    }
}
public class file{
    public static void main(String args[]){

        puppy p1=new puppy();
        p1.sleep();
        p1.bark();
        p1.sleep();
    }

}