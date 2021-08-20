public class Objects {

    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar2.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);


        // myCar.drive();
        // myCar.brake();


    }


}

class Car {
    String make = "chevrolet";
    String model = "corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;


    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You stop the car");
    }

}


