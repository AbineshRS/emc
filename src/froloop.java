import java.util.Scanner;

public class froloop {
    public static void main(String args[]){
        //Using for loop
        int counter;
        // initilizaton; condition; increment/decrement
        for(counter=1;counter<=10;counter++){
            System.out.println("using for loop"+counter);
        }
        //Using while Loop
        int i;
        i=1;
        while (i<=5){
            System.out.println("using while loop"+i);
            i++;
        }
        // Using do loop
        int j;
        j=1;
        do{
            System.out.println("Suing do loop"+j);
            j++;
        }while (j<=5);

    }
}
