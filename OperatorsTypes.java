public class OperatorsTypes{
    public static void main(String args[]){
        int a=10;
        int b=5;

        //Arithmetic Operators :  
        System.out.println("Arithmetic Operators : ");
        System.out.println("Addition(+) : " + (a+b));
        System.out.println("Subtraction(-) : " + (a-b));
        System.out.println("Multiplication(*) : " + (a*b));
        System.out.println("Division(/) : " + (a/b));
        System.out.println("Modulus(%) : " + (a%b));

        System.out.println();

        //Relational Operators : 
        System.out.println("Relational Operators : ");
        System.out.println("Equals To(==) : " + (a==b));
        System.out.println("Not Equals To(==) : " + (a!=b));
        System.out.println("Greater Than(>) : " + (a>b));
        System.out.println("Smaller Than(<) : " + (a<b));
        System.out.println("Greater Than Equals To(>=) : " + (a>=b));
        System.out.println("Smaller Than Equals To(<=) : " + (a<=b));

        System.out.println();

        //Logical Operators : 
        System.out.println("Logical Operators : ");
        System.out.println("Logical AND(&&) : " + (a>5&&b<10));
        System.out.println("Logical OR(||) : " + (a<5||b>10));
        System.out.println("Logical NOT(!) : " + (!(a<5)));

        System.out.println();

        //Bitwise Operators :
        System.out.println("Bitwise Operators : ");
        System.out.println("Bitwise AND(&) : " + (a&b));
        System.out.println("Bitwise OR(|) : " + (a|b));
        System.out.println("Bitwise NOT(~) : " + (~a));
        System.out.println("Bitwise XOR(^) : " + (a^b));

        System.out.println();

        //Assignment Operators : 
        System.out.println("Assignment Operators : ");
        System.out.println("Assignment(=) : " + (a));
        System.out.println("Addition Assignment(+=) : " + (a+=5));
        System.out.println("Subtraction Assignment(-=) : " + (a-=5));
        System.out.println("Multiplication Assignment(*=) : " + (b*=2));
        System.out.println("Division Assignment(/=) : " + (a/=2));
        System.out.println("Modulus Assignment(%=) : " + (a%=2));

        System.out.println();

        //Ternary(Conditional) Operator : 
        System.out.println("Ternary(Conditional) Operators : ");
        String result = (a<=10) ? "True" : "False";
        System.out.println(result);
    }
}