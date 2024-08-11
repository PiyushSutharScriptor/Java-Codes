public class ElementPresentInArray {
    public static void main(String[] args) {
        int brr[] = {7,14,21,285,35,42};
        int el = 28;
        boolean isPresent = false;
        for(int element:brr){
            if(element==el){
                isPresent=true;
            }
        }

        if(isPresent){
            System.out.println(el + " is present in array");
        }
        else{
            System.out.println(el + " is not present in array");
        }
    }
}
