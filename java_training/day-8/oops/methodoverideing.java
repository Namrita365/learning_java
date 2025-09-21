public class methodoverideing {
    static class Parent{
    void greet(){
        System.out.println("hello parent");
    }
    }
    static class child extends Parent{
        void greet(){
            System.out.println("Hello child");
        }
    }

    public static void main(String args[]){
        Parent p=new Parent();
        p.greet();
        child c=new child();
        c.greet();


        
    }
}
