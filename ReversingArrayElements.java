public class ReversingArrayElements {
    public static void main(String[] args) {
        int arr[] = {50,40,30,20,10};

        System.out.println("Elements Before Reversing : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println();
        System.out.println("Elements After Reversing : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}