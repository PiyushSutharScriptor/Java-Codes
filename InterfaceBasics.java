interface College{
    public static final int book = 20;
    public int subject = 5;

    public void books();
    public abstract void subjects();
}

class Students implements College{
    public void books(){
        System.out.println("No. Of Books : " + book);
    }

    public void subjects(){
        System.out.println("No. Of Subjects : " + subject);
    }
}

public class InterfaceBasics {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.books();
        s1.subjects();
    }
}
