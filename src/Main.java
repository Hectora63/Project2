import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Item apple= new Item();
        Actions yes= new Actions();

        String inputAction="";

        System.out.println("in");

        apple.show();

        while (!inputAction.equals("exit")) {
            yes.show();
            inputAction = scan.next();
         yes.xMovement(inputAction);
         yes.yMovement(inputAction);

        }

        scan.close();

    }
    }