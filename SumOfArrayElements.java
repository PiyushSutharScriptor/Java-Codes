public class SumOfArrayElements {
    public static void main(String[] args) {
        //Method 01:
        float arr[] = {10.2f,20.5f,30.65f,70.87f,98.25f,21.47f};
        float sum=0;
        for(int i=0 ; i<arr.length ; i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum Of Array Element : " + sum);

        //Method 02 :
        float arr2[] = {10.2f,20.5f,30.65f,70.87f,98.25f,21.47f};
        float sum2=0;
        for(float element:arr2){
            sum2=sum2+element;
        }
        System.out.println("Sum Of Array Element : " + sum2);
    }
}
