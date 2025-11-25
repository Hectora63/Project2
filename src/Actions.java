public class Actions {
    private int xPos = 0;
    private int yPos = 0;
    public int xBound = 0;
    public int yBound = 0;

    public Actions(String mode) {

        switch (mode) {
            case "Easy":
                xBound = 3;
                yBound = 3;
                break;
            case "Medium":
                xBound = 5;
                yBound = 5;
                break;
            case "Hard":
                xBound = 8;
                yBound = 8;
                break;
        }
        System.out.println((xBound - 1) + "," + (yBound - 1));

        //xBound = (int) ((Math.random() * 5) + 3);
        //yBound = (int) ((Math.random() * 5) + 3);
        //  System.out.println(xBound - 1);
        // System.out.println(yBound - 1);

    }

    void Forward() {
        yPos += 1;
    }

    void Back() {
        yPos -= 1;
    }

    void Left() {
        xPos -= 1;
    }

    void Right() {
        xPos += 1;
    }

    void Movement(String input) {

        switch (input) {
            case "Left":
                Left();
                break;

            case "Right":
                Right();
                break;

            case "Forward":
                Forward();
                break;

            case "Back":
                Back();
                break;
        }

        if ((Math.abs(yPos) >= yBound)) {
            yPos -=1;
            System.out.println("Wall");
        }

        if ((Math.abs(xPos) >= xBound)) {
            xPos -=1;
            System.out.println("Wall");
        }

    }

    void show() {
        System.out.println("X:" + xPos + "," + " Y:" + yPos);
    }

    int check(String input, int xInput, int yInput) {
        if (input.equals("Check")) {
            if (xInput == xPos && yInput == yPos) {
                System.out.println("Congrats apple found.");
                return 1;
            }
            System.out.println("Nothing here.");
        }
        return 0;
    }

    void search(String input, int xInput, int yInput) {

        if (input.equals("Search")) {
            if(xInput==xPos&&yInput==yPos){
                System.out.println("Fire");
            }
            else{
            double distance = Math.sqrt(((xInput - xPos) ^ 2) + ((yInput - yPos) ^ 2));
            System.out.println(distance);
            if (distance <= 1.5) {
                System.out.println("Hot");

            } else if (distance <= 2.5) {
                System.out.println("Warm");

            } else {
                System.out.println("Cold");

            }
            }
        }

    }

}
