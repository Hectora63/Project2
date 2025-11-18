public class Actions {
    private int xPos=0;
    private int yPos=0;


public Actions (){

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
 void movement(String input)
    {
        if(input.equals("Forward")){
            Forward();
        }
        if(input.equals("Back")){
            Back();
        }
        if(input.equals("Left")){
            Left();
        }
        if(input.equals("Right")){
            Right();
        }
        System.out.println(xPos);
        System.out.println(yPos);

    }
}
