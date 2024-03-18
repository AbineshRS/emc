import java.util.Scanner;

public class First {
    public static void main(String args[]){
        Scanner scann=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scann.nextLine();
        System.out.println("your nam is:"+name);
        System.out.println("Enter your age");
        int age=scann.nextInt();
        System.out.println("your age is:"+age);

        System.out.println("enter decimal values");
        float flo=scann.nextFloat();
        System.out.println("your float values is:"+flo);
    }

}
