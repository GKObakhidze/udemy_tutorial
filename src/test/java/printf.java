public class printf {

    public static void main(String[] args){


        //System.out.printf("%d This is a format string",123);

        boolean myboolean = true;
        char myChar = '@';
        String myString = "Giga";
        int myInt =50;
        double myDouble =1000;


        // [conversion-character]
//        System.out.printf("%b",myboolean);
//        System.out.printf("%c",myChar);
//        System.out.printf("%s",myString);
//        System.out.printf("%d",myInt);
//        System.out.printf("%f",myDouble);

        ///[width]
        //minimum number of characters to be written as output
//        System.out.printf("Hello %-10s",myString);

     // [precision]
        //sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %.1f",myDouble);

        //[flags]

        //System.out.printf("You have this much money %020f",myDouble);
        System.out.printf("You have this much money %,f",myDouble);


    }
}
