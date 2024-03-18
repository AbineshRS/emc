
  class employe{// super
   private String name;
    private double salary;
    employe(String n,double s){
        name=n;
        salary=s;
    }
    employe(){
        name="";
        salary=0.0;
    }
   public String getName(){
        return name;
    }
   public void setName(String n){
        name=n;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double s){
        salary=s;
    }
    void raisesalary(double percent){
        salary+=salary*percent/100;
    }

  }

  class manager extends employe{// sub
    double bonus;
    manager(String n,double s,double b){
        super(n,s);
        bonus=b;
    }
    void setBonus(double b){
        bonus=b;
    }
   public double getSalary(){
        return super.getSalary()+bonus;
    }
  }
    public class inheritence {
    public static void main(String args[]){
        employe e1=new employe("aa",1200);
        System.out.println(e1.getName()+"\n"+e1.getSalary());
        e1.raisesalary(100);
        System.out.println(e1.getSalary());
        manager m1= new manager("dd",1200,300);
        //m1.setBonus(300);
        System.out.println(m1.getSalary());
    }
}
