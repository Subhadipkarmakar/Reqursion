public class power {
    
    public static   int ispower(int x,int n){
        if(n==0){
            return 1;
        }
       int powx1=ispower(x, n-1);
       return x*powx1;
    }
    public static void main(String[] args) {
        System.out.println(ispower(10,2 ));
    }
}
