public class object_passing {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Cars car1 = new Cars("BMW");
        Cars car2 = new Cars("Tesla");

        garage.park(car1);
        garage.park(car2);


    }
}



class Garage {
    void park(Cars car) {
        System.out.println("The " + car.name + " is parked in the garage");
    }

}



class Cars {


    String name;

    Cars(String name) {
        this.name = name;
    }

}