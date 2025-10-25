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
class Circle extends Triangle{
    void display_area(float r){
        System.out.println(3.14*r*r);
    }
}
public class multilevel_inheritance {
      public static void main(String[] args)
      {
        Circle c=new Circle();
        c.display_area();
        c.display_area(4,6);
        c.display_area(5.5f);

      }
}
