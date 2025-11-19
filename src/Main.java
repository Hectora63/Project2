import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Actions yes= new Actions();

        String inputAction="";

        World test=new World();

        System.out.println("in");

        while (!inputAction.equals("Exit")) {

             inputAction = scan.next();
         test.starterRoom(yes.xMovement(inputAction),yes.yMovement(inputAction));
        }

        scan.close();

    }
    }