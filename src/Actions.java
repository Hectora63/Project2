public class Actions {
    private int xPos=0;
    private int yPos=0;
    private int xBound=0;
    private int yBound=2;

public Actions (){

    xBound= (int)((Math.random()*5)+2);
   // yBound= (int)((Math.random()*2)+1);
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

 void yMovement(String input) {
     int temp = yPos;
     if (input.equals("Forward")) {
         Forward();
     }
     else if (input.equals("Back"))
     {
         Back();
     }
     if ((Math.abs(temp) >= yBound) || (Math.abs(xPos) >= yBound))
     {

             yPos = temp;
         }
         System.out.println(yPos);
     }

    void xMovement(String input)
    {
        if(Math.abs(xPos)>=xBound){
            System.out.println(xPos);
            return;
        }
        else if(input.equals("Left")){
            Left();
        }
        else if(input.equals("Right")){
            Right();
        }
        System.out.println(xPos);
    }



}
