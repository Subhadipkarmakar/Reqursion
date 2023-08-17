public class revercenumbers {
   static int sum=0;
    public static void reverce(int n){
        
        if(n==0){
            return;
        }
        int remainder=n%10;
        sum=sum*10+remainder;
        n=n/10;
        reverce(n);
    }
    public static void main(String[] args) {
        reverce(1234);
      System.out.println(sum);
    }
}
