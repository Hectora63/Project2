import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Actions yes= new Actions();
        String inputAction="";
        System.out.println("in");
        while (!inputAction.equals("Exit")) {
             inputAction = scan.next();
          yes.movement(inputAction);
        }
        scan.close();

    }
    }