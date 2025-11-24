public class Actions {
    private int xPos=0;
    private int yPos=0;
    public int xBound=0;
    public int yBound=0;

public Actions (){

    xBound= (int)((Math.random()*5)+3);
   yBound= (int)((Math.random()*5)+3);
    System.out.println(xBound-1);
    System.out.println(yBound-1);

}

void  Forward()
{
    yPos += 1;
}
void Back()
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
     if ((Math.abs(temp) >= yBound) || (Math.abs(yPos) >= yBound))
     {

             yPos = temp;
         }

     }

    void xMovement(String input) {
        int temp = xPos;
        if (input.equals("Left")) {
            Left();
        } else if (input.equals("Right")) {
            Right();
        }
        if ((Math.abs(temp) >= xBound) || (Math.abs(xPos) >= xBound)) {

            xPos = temp;
        }

    }

    void show()
    {
        System.out.println("X:" + xPos + "," + " Y:" + yPos);
    }

    int check(String input , int xInput,int yInput)
    {
        if(input.equals("Check")||xInput==xPos||yInput==yPos)
        {
            return 1;
        }
        else {
            return 0;
        }

    }

}
