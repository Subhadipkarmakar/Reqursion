public class sum {
    public static int calculatesum(int n){
        if(n==1){
            return 1;
        }
int sum2=n+calculatesum(n-1);
return sum2;

    }
    public static void main(String[] args) {
        System.out.println(calculatesum(10));
    }
}
