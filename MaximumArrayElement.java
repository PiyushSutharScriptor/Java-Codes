
public class MaximumArrayElement {
    public static void main(String[] args) {
        //Method : 1
        int arr[] = {8,5,-9,87,-522,6,98,74};
        int max = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("The Maximum Array Element : " + max );

        //Method : 2
        int arr2[] = {8,5,-9,87,-522,6,988,74};
        int max2 = arr2[0];
        for(int element : arr2){
            if(element>max2){
                max2 = element;
            }
        }
        
        System.out.println("The Maximum Array Element : " + max2);

    }    
}