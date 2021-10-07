package ClassObject;

public class Student {
    String name;
    int id;
    float cgpa;


    public static void main(String[] args) {
        Student mehrab=new Student();
        Student ekram=new Student();

        mehrab.id=1344;
        mehrab.name="Mehrab Hossain Opi";
        mehrab.cgpa=3.95f;

        ekram.id=1320;
        ekram.name="Ekramul Hoque Ahnaf";
        ekram.cgpa=3.60f;


        System.out.println( mehrab.id+" "+mehrab.name+"  "+mehrab.cgpa);
        System.out.println( ekram.id+" "+ekram.name+"  "+ekram.cgpa);
    }
}
