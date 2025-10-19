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
}
public class copyConstructor {
    public static void main(String args[]){
        Student s1=new Student("Priya",20);
        s1.name="Namrita";
        s1.age=21;
        s1.printInfo();
    }
}
