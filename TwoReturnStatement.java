public class TwoReturnStatement {
    static int[] addSub(int a,int b){
        int result[] = new int[2];
        result[0] = a+b;
        result[1] = a-b;
        return result;
    }
    public static void main(String[] args) {
        int result[];
        result = addSub(5,5);
        System.out.println("The Addition is: " + result[0]);
        System.out.println("The Subtraction is : " + result[1]);
    }
}
