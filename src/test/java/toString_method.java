public class toString_method {
    public static void main(String[] args) {

        Cars1 car = new Cars1();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);



    }
}



class Cars1 {


    String make = "ford";
    String model = "mustang";
    String color = "red";
    int year = 2021;


}