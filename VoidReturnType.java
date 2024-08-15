public class VoidReturnType {
    static void hello(){
        System.out.println("Hello World");
    }

    void helloName(String name){
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        hello();
        VoidReturnType h1 = new VoidReturnType();
        h1.helloName("Programmers");

    }
}
