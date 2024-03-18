import java.util.Scanner;

class books extends Thread{
     public void run(){
        for(int i=0;i<5;i++){
            System.out.println("bb");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class num extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class multitreading {
    public static void main(String[] args) throws InterruptedException {
        books b1=new books();
        num n1=new num();
        //b1.database();
        b1.start();
        n1.start();
        b1.join();
        n1.join();
        System.out.println("bye");
    }
}
