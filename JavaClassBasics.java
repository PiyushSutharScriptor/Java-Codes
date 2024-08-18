class greet{
    int id;
    String name;
}

class student{
    public void boys(){
        System.out.println("All Boys Are Presnet");
    }
}

class student2{
    public int girls(int present , int absent){
        return present+absent; 
    }
}

public class JavaClassBasics{
    public static void main(String[] args) {

        // Case : 01
        greet g1 = new greet();
        g1.id = 10;
        g1.name ="Mahesh";
        System.out.println("Id : " + g1.id); 
        System.out.println("Name : " + g1.name); 

        System.out.println();

        //Case : 02
        student s1 = new student();
        s1.boys();

        System.out.println();

        //Case : 03
        student2 s2 = new student2();
        int total = s2.girls(52, 6);
        System.out.println("Total Girls : " + total);

        System.out.println();


    }
}