public class MethodUsingObjects {
    int addition(int a,int b){
        int c = a+b;
        return c;
    }

    int subtraction(int a, int b){
        int c = a-b;
        return c;
    }
    public static void main(String[] args) {
        MethodUsingObjects a1 = new MethodUsingObjects();
        int add = a1.addition(10, 20);
        System.out.println("The Addition Is : " + add);
        int sub = a1.subtraction(30, 20);
        System.out.println("The Subtraction Is : " + sub);
    }
}
