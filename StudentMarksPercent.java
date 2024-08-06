import java.util.Scanner;
public class StudentMarksPercent {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks Of Subject 1 : ");
        int s1 = input.nextInt();
        System.out.print("Enter Marks Of Subject 2 : ");
        int s2 = input.nextInt();
        System.out.print("Enter Marks Of Subject 3 : ");
        int s3 = input.nextInt();
        System.out.print("Enter Marks Of Subject 4 : ");
        int s4 = input.nextInt();
        System.out.print("Enter Marks Of Subject 5 : ");
        int s5 = input.nextInt();

        int total = s1+s2+s3+s4+s5;
        System.out.println("Total Marks : " + total);

        double percent = total/5.0;
        System.out.println("Total Percentage : " + percent);
    }
}

