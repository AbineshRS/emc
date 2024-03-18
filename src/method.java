public class method {
    static int box(int height,int length /* Arguments*/){// methodes
        int n;
        n=height*length;
        System.out.println(n);
        return n;
    }
    static int cs(){
        System.out.println("------------");
        return 0;
    }
    public static void main(String args[]){
        System.out.println("haii");
        cs();
        box(23,45);// passing arguments
        box(23,45);
        cs();

    }
}
