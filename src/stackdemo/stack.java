package stackdemo;

public class stack {
    int s[]=new int[10];
    int top;

    stack(){
        top=-1;
    }
    void push(int item){
        if(top==9)
            System.out.println("Stack is full");
        else
            top=top+1;
            s[top]=item;
    }
    int pop(){
        if(top>=0)
            return s[top--];
        else
            System.out.println("e");
        return -1;
    }
}
