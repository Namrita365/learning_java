class pen{
        String color;
    String type;
    void write(){
        System.out.println("Write kuch bhi");
    }
    void display(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class classObj_Using_this {
    public static void main(String args[]){
        pen p1=new pen();
        p1.color="red";
        p1.type="ball";
        pen p2=new pen();
        p2.color="black";
        p2.type="gel";
        p1.display();
        p2.display();    
    }
}
