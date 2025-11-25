import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose difficulty: Easy, Medium, Hard: ");
        String mode = scan.next();
        Actions yes = new Actions(mode);

        Item apple = new Item(yes.xBound, yes.yBound);

        String inputAction;

        int check = 0;

        apple.show();

        while (!(check == 1)) {
            yes.show();
            inputAction = scan.next();
            yes.Movement(inputAction);
            yes.search(inputAction,apple.xPos,apple.yPos);
            check = yes.check(inputAction, apple.xPos, apple.yPos);

        }

        scan.close();

    }
}