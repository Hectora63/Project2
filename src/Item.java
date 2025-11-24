public class Item {
    public int xPos;
    public int yPos;

    public Item(int x, int y) {
        if ((int) (Math.random() + 0.5) == 1) {
            xPos = (int) ((Math.random() * (x - 1)) + 2);
        } else {
            xPos = (int) ((Math.random() * -(x - 1)) + 2);
        }

        if ((int) (Math.random() + 0.5) == 1) {
            yPos = (int) ((Math.random() * (y - 1)) + 2);
        } else {
            yPos = (int) ((Math.random() * -(y - 1)) + 2);
        }
    }

    void show() {
        System.out.println(xPos + " " + yPos);
    }


}
