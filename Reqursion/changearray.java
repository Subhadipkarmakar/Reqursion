public class changearray {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr+" ");
        }
    }
    public static void changearr(int arr[],int i,int val){
        if(i==arr.length){
            print(arr);
            return;
        }
        arr[i]=val;
        changearr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changearr(arr, 0, 1);
        print(arr);
    }       

      

}
