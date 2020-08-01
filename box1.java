import java.util.*;
        class box
        {
            public static void main(String[] args)
            {
                Scanner in=new Scanner(System.in);
                box obj=new box();
                box obj1 = new box();
                int  h,w,d;
                int  x,y;
                h=in.nextInt();
                w=in.nextInt();
                d=in.nextInt();
                x=obj.volume(h,w,d);
                y=obj1.volume(h,w,d);
            }
           int volume(int h1,int w1,int d1)
            {
                int  volume1;
                 volume1=h1*w1*d1;
                return(volume1);
            }
        }