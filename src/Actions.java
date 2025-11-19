public class Actions {
    private int xPos=0;
    private int yPos=0;
    private int xBound=0;
    private int yBound=0;

public Actions (){
    xBound= (int)((Math.random()*2)+1);
    yBound= (int)((Math.random()*2)+1);
    System.out.println(xBound);
    System.out.println(yBound);

}

void  Forward()
{
    yPos += 1;
}
void  Back()
    {
        yPos -= 1;
    }
void Left()
{
    xPos-=1;
}
void Right()
{
    xPos+=1;
}
 int yMovement(String input)
    {
        if(yPos==yBound){
            return yPos;
        }
        else if(input.equals("Forward")){
            Forward();
        }
        else if(input.equals("Back")){
            Back();
        }
        System.out.println(yPos);
        return yPos;

    }
    int xMovement(String input)
    {
        if(xPos>=xBound){
            return xPos;
        }
        else if(input.equals("Left")){
            Left();
        }
        else if(input.equals("Right")){
            Right();
        }
        System.out.println(yPos);
        return xPos;
    }
    void starterRoom(int x, int y)
    {

        if(Math.abs(x)==xBound)
        {
            System.out.println("Wall here");
            xPos=xBound;
        }
        if(Math.abs(y)==yBound)
        {
            System.out.println("Wall here");
            yPos=yBound;
        }
    }


}
