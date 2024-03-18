
interface vechile{
    void ride();
}
class car implements vechile{
       public void ride(){
            System.out.println("your a riding car");
        }
    }
    class bike implements vechile{
         public void ride(){
            System.out.println("your riding bike");
        }
    }
    class machanic{
        void check(vechile v){
            System.out.println("checking");
            v.ride();
        }
    }
    public class interdemo {
    public static void main(String args[]){

        machanic m=new machanic();
        car c = new car();
        bike b= new bike();
        m.check(c);
        m.check(b);
    }
}
