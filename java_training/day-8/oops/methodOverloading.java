public class methodOverloading {
    int add(int x,int y){
        return x+y;

    }
    void add(int x,int y,int z){
        System.out.println(x+y+z);
    }
    public static void main(String args[]){
        methodOverloading a=new methodOverloading();
        System.out.println(a.add(1,2));
        a.add(1,2,3);
        

    }
}
