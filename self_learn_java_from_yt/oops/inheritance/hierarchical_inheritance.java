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
class Rectange extends Shape{
    void display_area(int l,int b){
        System.out.println(l*b);
    }
}


public class hierarchical_inheritance {
      public static void main(String[] args)
      {
        Circle c=new Circle();
        c.display_area();
        c.display_area(4,5);
        c.display_area(5,4);

      }
}

