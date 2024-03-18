package stackdemo;

public class stackdemo {
    public static void main(String args[]){
       stack s1=new stack();
       s1.push(2);
       s1.push(5);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
        stack s2=new stack();
        s2.push(34);
        s2.push(12);
        System.out.println(s2.pop());
    }
}
