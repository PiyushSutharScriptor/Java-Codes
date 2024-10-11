public class TryCatch{
    public static void main (String[] args){
        int a = 50;
        int b = 0;
        System.out.println("Start");
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(a + " is not divisible by 0 ");
            System.out.println("Error : " + e);
        }
        System.out.println("End");
    }
}