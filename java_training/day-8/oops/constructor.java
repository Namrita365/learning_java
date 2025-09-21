public class constructor {
    String name;
    int roll;
    private constructor(String name,int roll) 
    {
        this.name=name;
        this.roll=roll;
    }
    void greet(){
        System.out.println("Hello "+this.name);
    }
    
    public static void main(String args[]){
        constructor o1=new constructor("Nam",1);
        constructor o2=new constructor("rita",2);
        System.out.println(o1.name);
        System.out.println(o2.roll);
        o1.greet();


    }
}
