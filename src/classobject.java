import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

class user{
    String name;
    int age;
}
class book{
    String bookname;
    int bookprice;
}
class card{
    String name;
    int number;
}
class message{
    String msg;
    int amount;
}
public class classobject {
    public static void main(String args[]){
       user userename=new user();
       userename.name="abi";
       userename.age=12;
        System.out.println("User name:"+userename.name+"\n"+"Age:"+userename.age);

        book bookna=new book();
        bookna.bookname="most";
        bookna.bookprice=250;
        System.out.println("Book:"+bookna.bookname+"\n"+bookna.bookprice);

        card cards=new card();
        cards.name="Aib";
        cards.number=2345678;
        System.out.println("book:"+cards.name+"\n"+cards.number);

        message remi=new message();
        remi.msg="fine";
        remi.amount=10;
        System.out.println("Reminder:"+remi.msg+"\n"+remi.amount);
    }

}
