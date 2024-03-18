import java.util.Scanner;
public class breaks {
    public static void main(String args[]){
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        n= scan.nextInt();
        while(true){
            if(n%10==0){
                System.out.println(n);
                break;
            }
            n--;
        }
    }
}
