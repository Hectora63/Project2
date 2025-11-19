

public class World {

    public World()
    {

    }

    void starterRoom(int x, int y)
    {
if(Math.abs(x)>=3)
{
    System.out.println("Wall here");
    x=2;
}
        if(Math.abs(y)>=2)
        {
            System.out.println("Wall here");
            y=1;
        }
    }
void test(int x,int y)
{
    if(Math.abs(x)>=3)
    {
        System.out.println("river here");
        x=2;
    }
    if(Math.abs(y)>=1)
    {
        System.out.println("river here");
        y=0;
    }
}

    }
