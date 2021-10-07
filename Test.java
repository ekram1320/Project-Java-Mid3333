package ClassObject;

public class Test {
    public static void main(String[] args) {
        A mehrab=new A();
        B ekram=new B();
        C taskin=new C();

        mehrab.id=1344;
        mehrab.name = "Mehrab Hossain Opi";
        mehrab.cgpa=3.95f;

        ekram.id=1320;
        ekram.name="Ekramul Hoque Ahnaf";
        ekram.cgpa=3.95f;

        taskin.id=1334;
        taskin.name="Tasmiya Taskin";
        taskin.cgpa=3.96f;

        System.out.println(mehrab.id+" "+mehrab.name+" "+ mehrab.cgpa);
        System.out.println(ekram.id+" "+ekram.name+" "+ ekram.cgpa);
        System.out.println(ekram.id+" "+ekram.name+" "+ ekram.cgpa);


    }
}
