public class findkey {
    public static int findarraykey(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
      return  findarraykey(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,7,9,2,5,1,7,9,5,8};
       System.out.println( findarraykey(arr, 5, 0));
    }
}
