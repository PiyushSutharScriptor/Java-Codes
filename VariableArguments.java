public class VariableArguments {
    static float sum(float ...arr){
        float result = 0;
        for(float element : arr){
            result+=element;
        }
        return result;
    }

    int sum(int ...arr){
        int result = 0;
        for(int element : arr){
            result += element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Addition Of Floating : " + (sum(10.25f+20.25f+30.25f)));
        VariableArguments intSum = new VariableArguments();
        System.out.println("Addition Of Integers : " + (intSum.sum(10,20,30)));

    }
}
