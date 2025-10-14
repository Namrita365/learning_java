 class pen{
    String color;
    String type;
    void write(){
        System.out.println("Write kuch bhi");
    }
}
public class classObjeg2 {
    public static void main(String args[]){
        pen p1=new pen();
        p1.color="red";
        p1.type="gel";
        System.out.println("i have "+p1.color+" "+p1.type+" pen");
        pen p2=new pen();
        p2.write();
    }
}
