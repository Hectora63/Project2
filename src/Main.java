import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int score=0;

        Actions yes= new Actions();

        String inputAction="";

        System.out.println("in");

        while (!inputAction.equals("exit")) {
            inputAction = scan.next();
         yes.xMovement(inputAction);
         yes.yMovement(inputAction);

        }

        scan.close();

    }
    }