import java.util.Scanner;

public class Do_While {

     public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

       /* System.out.println("Enter a Number");
        int value = scaner.nextInt();
        //როცა  ინპუთი არ უდრის 5 მაშინ გაგრძელებს რიცხვების გამოტანას. სანამ 5 არ იქნება ინფუთ ველიუში
        while (value != 5){
            System.out.println("Enter a Number:");
            value = scaner.nextInt();
        }
       */

         int value =0;
         do {
             System.out.println("Enter a Number: ");
             value = scaner.nextInt();
         }while(value !=5);

         System.out.println("Got 5!");






    }



}
