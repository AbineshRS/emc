package busResv;
import java.util.ArrayList;
import java.util.Scanner;

public class busdemo {
    public static void main(String args[]) {
        ArrayList<bus> buses=new ArrayList<bus>();
        ArrayList<booking> books=new ArrayList<booking>();

        buses.add(new bus(1,true,2));
        int user=1;
        Scanner scan=new Scanner(System.in);
        for(bus b:buses){
            b.businfo();
        }
        while (user==1){
            System.out.println("Enter the number1 to booking press 2 to exit");
            user= scan.nextInt();
            if(user==1){
                booking book=new booking();
                if(book.isAvilabe(books,buses)){
                    books.add(book); 
                    System.out.println("booked");
                }
                else{
                    System.out.println("unalbe to book");
                }
            }
        }
    }
}
