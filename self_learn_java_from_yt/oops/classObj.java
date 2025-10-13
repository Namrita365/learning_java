class bag
{
String color;
int price;
public void display(){
    System.out.println("It is beautiful");

}
bag(String col,int p){
    this.color=col;
    this.price=p;
}
}
public class classObj{

    public static void main(String args[]){
        bag b1=new bag("black",2000);
        bag b2=new bag("blue",3000);
        System.out.println("the colour of bag is "+b1.color+" and it is "+b1.price+" rupeees");
        b1.display();
        System.out.println("The bag in the "+b2.color+" is mine and it is of "+b2.price+" rupees");
    }
}