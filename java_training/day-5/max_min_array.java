public class max_min_array {
    public static void main(String args[]){
        int [] a={6,8,4,9,1,3,5};
        int m=a[0];
        for(int num:a){
            if(num>m){
                m=num;
            }
        }
        System.out.println(m+" is the max num");
    }
}
