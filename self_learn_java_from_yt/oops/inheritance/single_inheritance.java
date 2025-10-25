class Shapes{
    public void display_area(){
        System.out.println("displays area");
    }
}
class triangle extends Shapes{
    public void display_area(int l,int b){
        System.out.println(1/2*l*b);
    }
}
public class single_inheritance {
    public static void main(String args[]){

        triangle t=new triangle();
        t.display_area(2,3);
    }
}
