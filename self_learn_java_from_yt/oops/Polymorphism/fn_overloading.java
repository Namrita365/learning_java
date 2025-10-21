//same function name different parameters and return type 
class Employee{
    String name;
    int age;
    int sal;
    public void display(String name){
        System.out.println(name);
    }
    public void display(int age,int sal){
        System.out.println(age+" "+sal);
    }
    public void display(String name,int age,int sal){
        System.out.println(name+" "+age+" "+sal);
    }
}
public class fn_overloading{
    public static void main (String args[]){
        Employee e1=new Employee();
        // e1.name="Namrita";
        // e1.age=21;
        // e1.sal=800000;
        e1.display("Namrita");
        e1.display(21,800000);
        e1.display("Namrita",21,800000);
    }
}
