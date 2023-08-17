public class factorial {
    public static int facto(int n){
        if(n==0){
return 1;
        }
        int f=n*facto(n-1);
        return f;
    }
    public static void main(String[] args) {
        System.out.println(facto(5));
    }
}
