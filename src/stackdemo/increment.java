package stackdemo;
class box{
    int lenght;
    int breadth;
    int height;
    box(int a,int b,int c){
        lenght=a;
        breadth=b;
        height=c;
    }
}
public class increment {
    static void increment(int a){
       a++;
    }

    public static void main(String args[]){

        int a=10;
        increment(2);
        System.out.println(a);
        box b1=new box(3,4,5);
        System.out.println(b1.breadth);
    }
}
