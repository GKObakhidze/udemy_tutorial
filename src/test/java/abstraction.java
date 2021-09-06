public class abstraction {

    public static void main(String[] args) {

        //Vehicle1 vehicle = new Vehicle1();
        Car1 car = new Car1();

        car.go();

    }

}



abstract class  Vehicle1 {
      abstract void go();



}



class Car1 extends Vehicle1 {
    @Override
     void go() {
        System.out.println("The driver is driving the car");
    }



}