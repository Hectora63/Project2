public class Item {
    public int xPos;
    public int yPos;

    public Item(int x, int y) {
        if ((int) (Math.random() + 0.5) == 1) {
            xPos = (int) ((Math.random() * (x - 1)) +1);
        } else {
            xPos = -((int) ((Math.random() * (x - 1)) + 1));
        }

        if ((int) (Math.random() + 0.5) == 1) {
            yPos = (int) ((Math.random() * (y - 1)) + 1);
        } else {
            yPos = -((int) ((Math.random() * (y - 1)) + 1));
        }
    }

    void show() {
        System.out.println(xPos + ", " + yPos);
    }


}
