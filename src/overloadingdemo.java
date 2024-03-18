public class overloadingdemo {
    /* static  int max(int a,int b){
        return a>b?a:b;
    }
    static  double max(double a,double b){
        return a>b?a:b;
    }*/
    static void max(){
        System.out.println("no parameter");
    }
    static void max(int a,int c){
        System.out.println("two parameter");
    }
    static void max(int a,int b,int c){
        System.out.println("Three parameters");
    }
    static void max(String r,int c){
        System.out.println("parameter with String and integer");
    }
    static void add(int a,int b){
        int c,d;
        c=a+b;
        System.out.println(c);
        d=c/2;
        System.out.println(d);
    }
    public static void main(String args[]){

        /*System.out.println(max(3,5));
        System.out.println(max(3.4,5.7));*/
        max(3,5);
        max("aa",4);
        max();
        add(3,5);
        System.out.println(Math.abs(-3.4));

    }
}
