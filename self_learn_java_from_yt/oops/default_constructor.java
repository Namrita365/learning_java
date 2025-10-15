class Student{
    String name;
    int age;
    void display(){
        System.out.println("i am a student and my name is "+this.name+" and i am "+this.age+" years old");

    }
    Student(){
        System.out.println("hello");
    }
}
public class default_constructor {
    public static void main(String args[]){
        Student s=new Student();
        s.name="Namrita";
        s.age=21;
        s.display();
    }
}
