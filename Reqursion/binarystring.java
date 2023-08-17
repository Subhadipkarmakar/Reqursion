public class binarystring {
    public static void printbinstringer(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbinstringer(n-1,0 , str+("0"));
        if(lastplace==0){
printbinstringer(n-1, 1, str+("1"));
        }
    }
    public static void main(String[] args) {
        printbinstringer(3, 0, "");
    }
}
