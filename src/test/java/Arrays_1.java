public class Arrays_1 {
    public static void main(String[] args) {

//        String[] cars = {"Camaro","Tesla","BMW","Corvette"};
//        cars[0] = "Mustang";
//        System.out.println(cars[3]);

        String[] cars = new String[3];
        cars[0]= "Camaro";
        cars[1] = "Corvetta";
        cars[2]= "Tesla";

        for (int i=0; i<cars.length; i++){
           System.out.println(cars[i]);
        }



    }
}
