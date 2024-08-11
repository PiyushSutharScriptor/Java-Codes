public class ArrayBasic {
    public static void main(String[] args) {
        //Method 01 : 
        int [] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("Method 1 : " + arr[0]);
        System.out.println("Method 1 : " + arr[1]);
        System.out.println("Method 1 : " + arr[2]);
        System.out.println("Method 1 : " + arr[3]);
        System.out.println("Method 1 : " + arr[4]);
        
        System.out.println();

        //Method : 02 : 
        int [] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;
        System.out.println("Method 2 : " + arr2[0]);
        System.out.println("Method 2 : " + arr2[1]);
        System.out.println("Method 2 : " + arr2[2]);
        System.out.println("Method 2 : " + arr2[3]);
        System.out.println("Method 2 : " + arr2[4]);

        System.out.println();

        //Method 03 :
        int arr3[] = {10,20,30,40,50};
        System.out.println("Method 3 : " + arr3[0]);
        System.out.println("Method 3 : " + arr3[1]);
        System.out.println("Method 3 : " + arr3[2]);
        System.out.println("Method 3 : " + arr3[3]);
        System.out.println("Method 3 : " + arr3[4]);

        System.out.println();
        
        //Method 04 : 
        int arr4[] = {101,102,103,104,105};
        for(int i=0 ; i<arr4.length ; i++){
            System.out.println("Array At Index " + i + " is " + arr4[i]);
        }
    }
}
