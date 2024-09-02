public class SingleAndMultiArray{
    public static void main(String args[]){
        //Single Dimensional Array : 
        int arr[] = {1,2,5,8,4,7};
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Multi Dimensional Array : 
        int arr2[][] = {{1,2,3},{4,5,6}};
        for(int i=0 ; i<arr2.length ; i++){
            for(int j=0 ; j<arr2[i].length ; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
