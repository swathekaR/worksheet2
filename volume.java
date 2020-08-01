import java.util.*
class box
{
    public static void main (String[]args)
    {
        Scanner in=new Scanner(System.in);
        box obj=new box();
        float height,width,depth;
        height=in.nextFloat();
        width=in.nextFloat();
        depth=in.nextFloat();
        obj.volume(height,width,depth);
    }
    void volume(float height1,float width1, float depth1)
    {
        float volume1=height1*width1*depth1;
        System.out.println("volume="+volume1);
    }
}