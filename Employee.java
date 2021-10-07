package ClassObj1;

public class Employee {
    String name;
    int id;
    float salary;

    void insert(int i,String n, float sal){

        name=n;
         id=i;
       salary=sal;


    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.insert(1320,"Ekram",258);
        e2.insert(1344,"Mehrab",334);

        System.out.println("Object one information:"+e1.id+" "+e1.name+" "+e1.salary);
        System.out.println("Object two information:"+e2.id+" "+e2.name+" "+e2.salary);
    }
}
