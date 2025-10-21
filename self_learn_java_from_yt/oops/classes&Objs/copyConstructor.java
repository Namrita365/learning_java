class Student{
    String name;
    int age;
    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;

    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
        System.out.println("copy constructor called");

    }
}
public class copyConstructor {
    public static void main(String args[]){
        Student s1=new Student("Priya",20);
        s1.printInfo();
        Student s2=new Student(s1);
        s2.printInfo();

    }
}
