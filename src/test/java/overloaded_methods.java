public class overloaded_methods {

    public static void main(String[] args) {

             //int
        /*int x = add(1,2,3,4);
        System.out.println(x);*/
             //double
        double x = add(1.0,2.0,3.0,4.0);
        System.out.println(x);



    }
           //int
    static int add(int a,int b){
        System.out.println("This is overloaded method #1");
        return a+b;

    }
    static int add (int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a+b+c;
    }
    static int add (int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a+b+c+d;
    }



        // double

    static double add(double a,double b){
        System.out.println("This is overloaded method #4");
        return a+b;

    }
    static double add (double a, double b, double c){
        System.out.println("This is overloaded method #5");
        return a+b+c;
    }
    static double add (double a, double b, double c, double d){
        System.out.println("This is overloaded method #6");
        return a+b+c+d;
    }


}
