class Student{
    String name;
    int age;
    char gen;
    public void display(){
        
    }


    Student(String name,int age,char gen){
        this.name=name;
        this.age=age;
        this.gen=gen;

    }
    public void info(){
        System.out.println("Hello my i am a "+this.gen+" and my name is "+this.name+" and i am "+this.age+" years old!!");
    }
}
public class parameterized_constructor {
        public static void main(String args[]){
            Student s1=new Student("Sandhya",19,'f');
            s1.info();
        }
}
