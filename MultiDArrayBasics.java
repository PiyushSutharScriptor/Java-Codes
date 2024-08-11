public class MultiDArrayBasics {
    public static void main(String[] args) {
        //Method : 01
        int [][] multiArr; 
        multiArr = new int[2][2];
        multiArr[0][0] = 10;
        multiArr[0][1] = 20;
        multiArr[1][0] = 30;
        multiArr[1][1] = 40;
        System.out.println(multiArr[0][0]);
        System.out.println(multiArr[0][1]);
        System.out.println(multiArr[1][0]);
        System.out.println(multiArr[1][1]);

        System.out.println();

        // //Method : 02
        int [][] multiArr2 = new int[2][2];
        multiArr2[0][0] = 10;
        multiArr2[0][1] = 20;
        multiArr2[1][0] = 30;
        multiArr2[1][1] = 40;
        System.out.println(multiArr2[0][0]);
        System.out.println(multiArr2[0][1]);
        System.out.println(multiArr2[1][0]);
        System.out.println(multiArr2[1][1]);

        System.out.println();

        //Method : 03
        int multiArr3[][] = {{10,20},{30,40}};
        for(int i=0 ; i<multiArr3.length ; i++){
            for(int j=0 ; j<multiArr3[i].length ; j++){
                System.out.print(multiArr3[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
