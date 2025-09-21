public class example {
    static class Person{
        String name;
        String gender;
        private Person(String n,String g){
            this.name=n;
            this.gender=g;
        }
    }

    public static void main(String args[]){
        Person p1=new Person("Namrita","Female");
        Person p2=new Person("Shifa","Female");
        System.out.println(p1.name);
        System.out.println(p2.gender);
        System.out.println(p1.name+" and "+p2.name+" both are best friends");
        

    }
    
}
