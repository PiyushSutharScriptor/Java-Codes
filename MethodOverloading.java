public class MethodOverloading {
    static int add(int a,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }

    int sub(int a,int b){
        return a-b;
    }

    int sub(int a,int b,int c){
        return a-b-c;
    }

    public static void main(String[] args) {
        //Method : 01
        int add1 = add(10,10);
        System.out.println("Addition First : " + add1);    
        int add2 = add(10,10,10);
        System.out.println("Addition Second : " + add2);    

        System.out.println();
        
        //Method : 02
        MethodOverloading s1 = new MethodOverloading();
        int sub1 = s1.sub(20, 10);
        int sub2 = s1.sub(30,20,10);
        System.out.println("Subtraction First : " + sub1);
        System.out.println("Subtraction Second : " + sub2);

    }
}
