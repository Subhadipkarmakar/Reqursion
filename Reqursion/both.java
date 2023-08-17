public class both {
    public static void funboth(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        funboth(5);
    }
}
