public class exchandling {

    public static void main(String args[])
    {
    int [] a={1,2,3,4,5};
    int x=9,y=0;
    try{
        int d=x/y;
        System.out.println(d);
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println(":run anyway");
    }
    }
}
