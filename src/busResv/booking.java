package busResv;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class booking {
    String name;
    int busno;
    Date date;
    booking(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name");
        name=scan.next();
        System.out.println("Enter the bus no");
        busno=scan.nextInt();
        System.out.println("Enter the date dd-mm-yyy");
        String dateInput=scan.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public boolean isAvilabe(ArrayList<booking>bookings,ArrayList<bus>buses) {

        int capacity = 0;
        int booked = 0;
        for (bus bus : buses) {
            if (bus.getBusno() == busno) {
                capacity = bus.getCapacity();
            }
            booked = 0;
            for (booking b : bookings) {
                if (b.busno == busno && b.date.equals(date)) {
                    booked++;
                }

            }

        }

        return booked < capacity ? true : false;
    }

}
