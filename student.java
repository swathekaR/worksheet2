public static void main(String[] args) {
        student obj[]=new student[10];
        for(int i=0;i<10;i++)
        {
            obj[i]=new student();
            obj[i].getdata();
            obj[i].markcal();
            obj[i].display();
        }
    
class student
{
    String name,dept,status;
    double m1,m2,m3,avg;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter name:");
        name=obj.next();
        System.out.println("enter dept:");
        dept=obj.next();
        System.out.println("enter marks:");
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();
    }
    void markcal
    {
        avg=(m1+m2+m3)/3;
        if(m1<50 ||m2<50||m3<50){
            status="Fail";
        }
        else{
            if(avg>=80)
                status="First class";
            if(avg>=70&&avg<=79)
                status="Second class";
            if(avg>=50&&avg<=69)
                status="Third class";
            
        }
    }
    void display()
    {
        System.out.println("Name:"+name+"\nDept:"+dept+"\nM1:"+m1+"\nM2"+m2+"\nM3:"+m3+"\nAverage:"+avg+"\nstatus:"+status);
    }
}
           