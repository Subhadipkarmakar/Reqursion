public class findkey2 {
    public static int lastoccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
         int isfound=lastoccurance(arr, key, i+1);
         if(isfound!=-1){
            return isfound;
         }
         if(arr[i]==key){
            return i;
         }
         return isfound;
    }
    public static void main(String[] args) {
        int arr[]={8,7,9,2,5,1,7,9,5,8};
       System.out.println(lastoccurance(arr, 5, 0)); 
    }
}
