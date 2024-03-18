public class abstrac {
    abstract class member{
        private String name;
        abstract void message();
    }
    class student extends member{
        void message(){
            System.out.println("wlcome student");
        }
    }
    class teacher extends member{
        void message(){
            System.out.println("wlecome teacher");
        }
    }
    public void main(String args[]){


    }
}
