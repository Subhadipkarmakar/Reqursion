public class pairing {
    public static int friendspairing(int n){
        if(n==1||n==2){
            return n;
        }
        //single
       int fnm1=friendspairing(n-1);
       //pairing
       int fnm2=(n-1)*friendspairing(n-2);
       int totalpairing=fnm1+fnm2;
       return totalpairing;
    }
    public static void main(String[] args) {
        System.out.println(friendspairing(3));
    }
}
