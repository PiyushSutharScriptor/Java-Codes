public class ArraySortedOrNot {
    public static void main(String[] args) {
        int arr[] = {4,5,5,10,10,5,99,99,5,7,7};
        boolean isSorted = true;
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("Array Elements Are Sorted");
        }
        else{{
            System.out.println("Array Elements Are Not Sorted");
        }}
    }
}
