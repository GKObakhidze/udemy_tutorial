public class toString_method {
    public static void main(String[] args) {

        Cars car = new Cars();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);



    }
}



class Cars {


    String make = "ford";
    String model = "mustang";
    String color = "red";
    int year = 2021;


}