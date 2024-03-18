import java.util.Scanner;
public class brreakloop {
    public static void main(String args[]){
        // Using break
      int n;
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number");
      n=scan.nextInt();
      while(true){
          if(n%10==0){
              System.out.println(n);
              break;
          }
          n--;
      }
      int a,sum=0;
      Scanner scann=new Scanner(System.in);
      System.out.println("Enter the number");
      while(true){
          a=scann.nextInt();
          if(a<=0){
              break;
          }
          sum=sum+a;
      }
      System.out.println(sum);
      // Using Countinu
        int c;
        Scanner scane=new Scanner(System.in);
        System.out.println("enter the number");
        c=scane.nextInt();
        for(int i=0;i<c;i++){
            if(i==7)
                continue;
            System.out.println(i);
        }
    }
}
