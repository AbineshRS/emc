import java.util.Scanner;

public class demoif {
    public static void main(String args[]){
        long a,b;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the number");
        a= scan.nextInt();
        System.out.println("enter the number");
       b=scan.nextInt();
        if(a%5==0 && b%10==0)
            System.out.println("It is divisible by 2 && 3");
        //else if(a%4==0)
            //System.out.println("It is divisible by 4");
        else
            System.out.println("It is not dividble by both 2 and 4");
    }
}
