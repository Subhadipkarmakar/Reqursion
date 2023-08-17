public class fibonacii {
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fibn1=fib(n-1);
        int finn2=fib(n-2); 
        int fibn=fibn1+finn2;
        return fibn;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
