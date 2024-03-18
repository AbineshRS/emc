public class expectiondemo {
    public static void main(String args[]){
        int a=10,b=0,c=0;
        try {
            int arr[]=null;
            System.out.println(arr[1]);
            c=a/b;//throw
        }catch (ArithmeticException e){
            System.out.println("rthematic expection");
        }
        catch (NullPointerException e){
            System.out.println("Null expresion");
        }
        catch (Exception e){
            System.err.println("error");
        }
        System.out.println(c);
    }
}
