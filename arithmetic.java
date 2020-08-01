import java.util.*;
        class arithmetic
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        arithmetic obj=new arithmetic();
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
    }
    
    void add(int a1,int b1)
      {
        int c1=a1+b1;
                System.out.println("the addition of two numbers is="+c1);
       }

    void sub(int a1, int b1)
                    {
                        int c1=a1-b1;
             System.out.println("the subtraction of two numbers is="+c1);
                     }
     void mul(int a1,int b1)
                       {
           int c1=a1*b1;
           System.out.println("the multiplication of two numbers is="+c1);
                            }                                
     void div(int a1,int b1)
       {
           int c1=a1/b1;
          System.out.println("the division of two numbers is="+c1);
        }
    }
                         