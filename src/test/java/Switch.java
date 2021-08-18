import java.util.Scanner;

public class Switch {
    public void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a commnad: ");
        String text = input.nextLine();

        switch (text){
            case  "Start":
                System.out.println("Machine Started!");
                break;
            case "Stop":
                System.out.println("Machine stopped!");
                break;
            default:
                System.out.println("Command not recognized");
        }




    }


}
