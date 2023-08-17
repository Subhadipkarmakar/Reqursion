public class indexfound {
    public static int findindex(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findindex(arr, target, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=3;
        System.out.println(findindex(arr, target, 0));
    }
}
