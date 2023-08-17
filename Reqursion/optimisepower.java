public class optimisepower {
    public static int ispower(int x,int n){
        if(n==0){
            return 1;
        }
      int  halfpower =ispower(x, n/2);
      int halfpowersqr=halfpower*halfpower;
      if(x%2!=0){
        return x*halfpowersqr;
      }
 return halfpowersqr;
     
    }
    public static void main(String[] args) {
        System.out.println(ispower(5,3 ));
    }
}
