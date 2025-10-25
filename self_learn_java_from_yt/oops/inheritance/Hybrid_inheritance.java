class Shape
{
    void display_area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    void display_area(int l,int b){

        System.out.println(0.5*l*b);
    }
}
class Rectangle extends Shape{
    void display_area(int l,int b){
        System.out.println(l*b);
    }
}

class Square extends Rectangle{
    void display_area(int a){
        System.out.println(a*a);
    }

}
public class Hybrid_inheritance {
    public static void main(String args[]){
        Square s=new Square();
        s.display_area();
        s.display_area(3,2);
        s.display_area(4);
        Triangle t=new Triangle();
        t.display_area(4,5);
    }
}
