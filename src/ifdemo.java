import java.util.Scanner;
public class ifdemo {
    public static void main(String args[]){
       int m1;
       Scanner sann=new Scanner(System.in);
       System.out.println("Enter your mark");
       m1= sann.nextInt();
       if(m1>90){
           System.out.println("your grade A");
       }else if(m1>80){
           System.out.println("your grade B");
       }else if(m1>70){
           System.out.println("your grade C");
       }else if(m1>60){
           System.out.println("your grade C");
       }else {
           System.out.println("your grade below C");
       }
    }
}
