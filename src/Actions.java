public class Actions {
    private int xPos=0;
    private int yPos=0;


public Actions (String input){
if(input.equals("Forward")){
    Forward();
}
System.out.println(xPos);
    System.out.println(yPos);
}

void  Forward()
{
    yPos += 1;

}
}
