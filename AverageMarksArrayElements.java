public class AverageMarksArrayElements {
    public static void main(String[] args) {
        //Method 1 :
        float marks[] = {98,87,78,96,82,76,69,93};
        float average = 0;
        float sum=0;
        for(float element:marks){
            sum = sum+element;
        }
        average = sum/(marks.length);
        System.out.println("Average Marks Of Students is(Method1) : " + average);
        //Method : 2
        int marks2[] = {98,87,78,96,82,76,69,93};
        float average2 = 0;

        int sum2=0;
        for(int element:marks2){
            sum2 = sum2+element;
        }
        average2 = sum*1.0f/marks.length;
        System.out.println("Average Marks Of Students is(Method2) : " + average2);
    }
}