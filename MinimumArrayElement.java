public class MinimumArrayElement {
    public static void main(String[] args) {
        //Method 1 : 
        int arr[] = {98,52,17,-877,-9,5,-87};
        int min = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum Array Element : " + min);

        //Method : 2
        int arr2[] = {98,52,17,-89,-99,-99,-99,5,-89};
        int min2 = arr2[0];
        for(int element:arr2){
            if(element<min2){
                min2=element;
            }
        }
        System.out.println("The Minimum Array Element : " + min2);

    }
}
