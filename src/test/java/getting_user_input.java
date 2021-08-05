import java.util.Scanner;

public class getting_user_input {
    public static void main(String[] args) {

        //create scaner object
        Scanner input = new Scanner(System.in);
        //output the promt
        System.out.println("Enter an floating point value: ");
        //wait for the user to enter somthing
        double value = input.nextDouble();

        //tell the what they entered
        System.out.println("You entered: "+ value);
    }
}
