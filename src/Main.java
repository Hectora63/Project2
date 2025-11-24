import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Actions yes= new Actions();

        Item apple= new Item(yes.xBound,yes.yBound);

        String inputAction="";

        int check=0;

        System.out.println("in");

        apple.show();

        while (check==0) {
            yes.show();
            inputAction = scan.next();
            yes.xMovement(inputAction);
            yes.yMovement(inputAction);

          check=yes.check(inputAction, apple.xPos, apple.yPos);



        }

        scan.close();

    }
    }