import java.util.*;
class patient{
    
    String name="";
    
    double weight,height;
    
    patient(String name, double weight,double height)
    {
        this.name=name;
        this.weight=weight;
        this.height=height;
    }
    static{
        System.out.println("First static block");
    }
    double BMI()
    {
        double Bmi=(weight/(height*height))*703;
        return Bmi;
        
    }  
    
}
class A{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        double height=sc.nextDouble();
        double weight=sc.nextDouble();
        patient p1=new patient(name,weight,height);
        System.out.println("BMI of patient "+name+" is : "+p1.BMI());
    }
    static {
        System.out.println("Static in Main");
    }
}
