public class JavaMethodsBasics {
    static int addition(int a,int b){
        int c;
        c = a+b;
        return c;
    }

    public static void main(String[] args) {
        int c;
        c = addition(5,5);
        System.out.println("The sum is : " + c);
    }
}
