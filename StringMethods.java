public class StringMethods {
    public static void main(String[] args){
        String name = "cOdInG";
        //length
        int length = name.length();
        System.out.println("length : " + length);
        //toLowerCase
        String lowercase = name.toLowerCase();
        System.out.println("toLowerCase : " + lowercase);
        //toUpperCase
        String uppercase = name.toUpperCase();
        System.out.println("toUpperCase : " + uppercase);
        //trim
        String trimstring = "           Java    ";
        System.out.println("trim : " + trimstring.trim());
        //substring(start)
        String startSubString = name.substring(1);
        System.out.println("substring(start) : " + startSubString);
        //substring(start,end)
        String startEndSubString = name.substring(1,5);
        System.out.println("substring(start,end) : " + startEndSubString);
        //replace(old,new) =>char
        String charReplace = name.replace('n','G');
        System.out.println("replace(old,new)<char> : " + charReplace);
        //replace(old,new) =>String
        String stringReplace = name.replace("dInG","ding");
        System.out.println("replace(old,new)<String> : " + stringReplace);
        //startsWith
        Boolean startswith = name.startsWith("cO");
        System.out.println("startsWith(start) : " + startswith);
        //endsWith
        Boolean endswith = name.endsWith("ing");
        System.out.println("endsWith(end) : " + endswith);
        //charAt(index)
        char charat = name.charAt(3);
        System.out.println("charAt(index) : " + charat);
        //indexOf(char)
        int indexof = name.indexOf('G');
        System.out.println("indexOf(char) : " + indexof);
        //lastIndexOf(String)
        //=>Case:1
        int lastindexof = name.lastIndexOf("InG");
        System.out.println("lastIndexOf(String) : " + lastindexof);
        //=>Case:2
        int lastindexof2 = name.lastIndexOf("juy");
        System.out.println("lastIndexOf(String) : " + lastindexof2);
        //lastIndexOf(String,start)
        String indexWithStart = "javajavajavajava";
        int lastindexwithstart = indexWithStart.lastIndexOf("java",4);
        System.out.println("lastIndexOf(String,start) : " + lastindexwithstart);
        //equals("String") 
        Boolean stringEqual = name.equals("cOdInG");
        System.out.println("equals(String) : " + stringEqual);
        //equalsIgnoreCase("String")
        Boolean stringEqualIgnore = name.equalsIgnoreCase("coding");
        System.out.println("equalsIgnoreCase(String) : " + stringEqualIgnore);
    }
}
