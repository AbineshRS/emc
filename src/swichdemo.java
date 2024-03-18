import java.util.Scanner;
public class swichdemo {
    public static void main(String args[]){
       int num1,num2;
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the first number");
       num1=scan.nextInt();
       System.out.println("Enter the second number");
       num2=scan.nextInt();
       char operator;
       System.out.println("enter the operator+,-,*,/ ");
       operator=scan.next().charAt(0);
       /*if(operator=='+'){
           System.out.println("Addition is:"+(num1+num2));
       } else if (operator=='-') {
           System.out.println("subtraction is:"+(num1-num2));
       } else if (operator=='*') {
           System.out.println("Multipication is:"+(num1*num2));
       } else if (operator=='/') {
           System.out.println("division is:"+(num1/num2));
       }else {
           System.out.println("in valid options");
       }*/
        switch (operator){
            case '+':
                System.out.println("Addition is"+(num1+num2));
                break;
            case '-':
                System.out.println("subtraction is:"+(num1-num2));
                break;
            case '*':
                System.out.println("mmultipication is:"+(num1*num2));
                break;
            case '/':
                System.out.println("divison is:"+(num1/num2));
                break;
            default:
                System.out.println("in valid option");
        }
    }
}
