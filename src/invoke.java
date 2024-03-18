class student{// class
    String name;
    int age;
    int m1;
    int m2;
    student(String n,int a,int b,int c){ // Using Constructor
        name=n;
        age=a;
        m1=c;
        m2=b;
    }
   int total(){// method
       return m1+m2;
    }
}
public class invoke {
    public static void main(String args[]){
       student students=new student("bb",66,100,50);// Using Constructor
       //students.name="aa";
       //students.age=34;
       //students.m1=50;
       //students.m2=50;
       System.out.println("By Using invoking"+"\n"+"Total is :"+students.total()+"\n");//Invoking Method
        System.out.println("By Using constructor"+"\n"+"Total marks:"+students.total()+"\n"+"name is:"+students.name);// Using constructor
    }
}
