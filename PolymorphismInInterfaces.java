interface Camera{
    void useCamera();
    void f4kRecording();
}

interface Music{
    void playMusic();
    void offMusic();
}

class SmartPhone implements Camera,Music{
    public void playMusic(){
        System.out.println("Music Play Method");
    }
    public void offMusic(){
        System.out.println("Music Off Method");
    }
    public void useCamera(){
        System.out.println("Camera Method");
    }
    public void f4kRecording(){
        System.out.println("4K Recording Method");
    }
}
public class PolymorphismInInterfaces{
    public static void main(String[] args) {
        Camera c1 = new SmartPhone();
        // c1.playMusic(); ==> gives error
        // c1.offMusic(); ==> gives error
        c1.useCamera();
        c1.f4kRecording();
    }
}