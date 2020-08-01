public class customerandinvoice
{
    
    public static void main(String[] args){
        customer obj=new customer(101,"swathi",20);
        customer obj1=new customer(102,"thrisha",30);
        invoice obj2=new invoice(100,obj,2000);
        System.out.println("CLASS");
        System.out.println(obj.getid());
        System.out.println(obj.getname());
        System.out.println(obj.getdiscount());
        obj.setdiscount(10);
        System.out.println("changed discount="+(obj.getdiscount()));
        System.out.println("PRINTING OBJECT");
        System.out.println(obj);
        System.out.println("INVOICE");
        System.out.println(obj2.getid());
        System.out.println(obj2.getcustomer());
        obj2.setcustomer(obj1);
        System.out.println(obj2.getamount());
        System.out.println("customer name after changing customer details"+obj2.getcustomername());
        obj2.setamount(4000);
        System.out.println("amount after discount="+(obj2.getamountafterdiscount()));
    }
    class customer
    {
        int id;
        String name;
        int discount;
        customer(int i,String n,int d)
        {
            id=1;
            name=n;
            discount=d;
        }
        int getid()
        {
            return id;
        }
        String getname()
        {
            return name;
        }
        int getdiscount()
        {
            return discount;
        }
        void setdiscount(int d1)
        {
            discount=d1;
        }
        public String toString()
        {
            return "ID "+id+"\nName "+name+"\nDiscount "+discount;
        }
    }
    class invoice
    {
        int id;
        customer o;
        double amount;
        invoice(int i,customer o1,double amt)
        {
            id=1;o=o1;
            amount=amt;
        }
        int getid()
        {
            return id;
        }
        customer getcustomer()
        {
            return o;
        }
        void setcusttomer(customer o2)
        {
            o=o2;
        }
        double setamount(double amt)
        {
            amount=amt;
        }
        String getcustomername()
        {
            return o.name;
        }
        double getamountafterdiscount()
        {
            amount=amount-(amount/100*o.getdiscount());
            return amount;
        }
    }
