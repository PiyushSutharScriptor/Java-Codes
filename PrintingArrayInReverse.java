public class PrintingArrayInReverse {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55};
        for(int i=arr.length-1 ; i>=0 ; i--){
            System.out.println("Element at index " + i + " is " + arr[i]);
        }

        /*The length of array is 5 and 
          index ends at 4 : 
          So that's why arr.length-1
        */

    }
}
