package BasicConcepts;

public class Test {
    public static void main(String[] args) {

        System.out.println("aobj");
//        A aobj = new A();
//        aobj.methodA();

        System.out.println("bobj");
        B bobj = new B();
        bobj.methodA();
        bobj.methodB();

        System.out.println("A or B?");
        int x = 10;
        A obj = new B();
        obj.methodA();
        obj.methodB();






    }

}
