public class Item {
private int xPos;
private int yPos;

public Item()
{
    if((int)(Math.random()+0.5)==1) {
        xPos= (int)((Math.random()*4)+2);
    }
    else{
        xPos= (int)((Math.random()*-4)+2);
    }

    if((int)(Math.random()+0.5)==1) {
        yPos= (int)((Math.random()*4)+2);
    }
    else{
        yPos= (int)((Math.random()*-4)+2);
    }
}




 void show()
{
    System.out.println(xPos +" " + yPos);
}


}
