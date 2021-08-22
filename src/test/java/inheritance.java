public class inheritance {
    public static void main(String[] args) {

        Car_1 car = new Car_1();
        //car.go();

        Bicycle bike = new Bicycle();
        // bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.padals);

    }
}


class Vehicle {

    double speed;

    void go() {
        System.out.println("This vehivle is moving");
    }

    void stop() {
        System.out.println("This vehicle is stoped");
    }

}

class Car_1 extends Vehicle {
    int wheels = 4;
    int doors = 4;


}

class Bicycle extends Vehicle {
    int wheels = 2;
    int padals = 2;

}
