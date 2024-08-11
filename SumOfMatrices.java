public class SumOfMatrices {
    public static void main(String[] args) {
        int matArr1[][] = {{1,2,3},{4,5,6}};
        int matArr2[][] = {{1,2,3},{4,5,6}};
        int resArr[][] = {{0,0,0},{0,0,0}};

        System.out.println("Sum Of Matrices : ");

        for(int i=0 ; i<matArr1.length ; i++){
            for(int j=0 ; j<matArr2[i].length ; j++){
                resArr[i][j] = matArr1[i][j] + matArr2[i][j];
                System.out.print(resArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
