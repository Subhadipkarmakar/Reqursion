public class sumofthedigits {
    public static int sumdig(int n){
        if(n==1){
            return 1;
        }
int reminder=n%10;
n=n/10;
return reminder+sumdig(n);

    }
    public static void main(String[] args) {
        System.out.println(sumdig(1234));
    }
}
