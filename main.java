package oop;

import java.util.Scanner;
public class main {
    public static void main(String[]args){
         Scanner input = new Scanner(System.in);
        String ans;
        System.out.println("|Calculator choices| \n|1-Basic calculator|\n|2-Zakat calculator|\n|3-Physics calculator|\n|4-Scientific calculator|");
        System.out.println("|Which calculator do you want to use ? : |");
        String calc_type = input.nextLine();
        if(calc_type.equalsIgnoreCase("zakat calculator"))
        {
             System.out.println("|**zakat calculator****|");
             System.out.println("|enter your gold worth|");
        int a=input.nextInt();
        zakat o=new zakat(a);
        o.zakat();
   }else if(calc_type.equalsIgnoreCase("basic calculator"))
        {
      System.out.println("|***basic calculator***|");
        System.out.println("enter the number 1");
        double a=input.nextDouble();
        System.out.println("enter the number 2");
        double b=input.nextDouble();
        basic o1 =new basic(a,b);
        o1.choice();}
        else if(calc_type.equalsIgnoreCase("physics calculator"))
        {
            System.out.println("|***physics calculator*****|");
   System.out.println("|Enter which physics formula to operate ? :|");
        String operation = input.nextLine();
        switch(operation)
        {
            case("density"):
                System.out.println("Enter mass : ");
                        double mass = input.nextDouble();
                System.out.println("Enter volume : ");
                        double volume = input.nextDouble();
                        physics o2=new physics(mass,volume);
         
                System.out.println("The density is : "+o2.DensityFormula()+" dm^3");
break;
case("acceleration"):  
                System.out.println("|Enter initial velocity :| ");
                        double initial_v = input.nextDouble();
                System.out.println("|Enter final velocity :| ");
                        double final_v = input.nextDouble();
                System.out.println("|Enter time : |");
                        double time = input.nextDouble();
physics obj2 = new physics(initial_v,final_v,time); 
System.out.println("The acceleration is : "+obj2.AccelerationFormula()+" km/s");
break;
case("force"):
                System.out.println("Enter mass : ");
                        int mass1 = input.nextInt();
                System.out.println("Enter acceleration : ");
                        double acceleration = input.nextDouble();    
physics obj3 = new physics(mass1,acceleration,0);
System.out.println("The force is : "+obj3.ForceFormula()+" N");
break;
case("flux"):
    System.out.println("Enter area : ");
                        double area = input.nextDouble();
                System.out.println("Enter magnet field : ");
                        double magnetic_field = input.nextDouble();
                System.out.println("Enter angle : ");
                        double angle = input.nextDouble();
physics obj4 = new physics(area,magnetic_field,angle);
System.out.println("The flux is : "+obj4.MagneticFluxFormula()+" weber");
break;
default:
    System.out.println("The operation entered is invalid!");
    System.out.println("Enter yes if you want the code to run again : ");
        }}else if(calc_type.equalsIgnoreCase("scientific calculator"))
       {
            System.out.println("**scientific calculator***");
            System.out.println("1-Sin\n2-Cos\n3-Tan\n4-Quadratic\n5-Log\n6-sqrt\n7-power");
            System.out.println("Which Scintific function do you want to perform? : ");
            String sci =input.nextLine();
            switch(sci)
            {
                case"sin":
                    System.out.println("Enter value : ");
            int val1 =input.nextInt();
            scientific obj5 = new scientific(val1);
            System.out.println("sin("+val1+") is : "+obj5.sin());
            break;
            case"cos":
                    System.out.println("Enter value : ");
            int val2 =input.nextInt();
            scientific obj6 = new scientific(val2);
            System.out.println("cos("+val2+") is : "+obj6.sin());
            break;
            case"tan":
                    System.out.println("Enter value : ");
            int val3 =input.nextInt();
            scientific obj7 = new scientific(val3);
            System.out.println("tan("+val3+") is : "+obj7.sin());
            break;
             
            case"quadratic":
                    System.out.println("Enter a : ");
            double a =input.nextDouble();
            System.out.println("Enter b : ");
            double b =input.nextDouble();
            System.out.println("Enter c : ");
            double c =input.nextDouble();
            scientific obj8=new scientific(a,b,c);
            break;
            case"log":
                    System.out.println("Enter value : ");
             int val4 =input.nextInt();
            scientific obj9 = new scientific(val4);
            System.out.println("The log10 of "+val4+" is : "+obj9.log());
            break;
            default:
            System.out.println("Invalid input");
            case"sqrt":
            System.out.println("Enter value : ");
            int val5 =input.nextInt();
            scientific obj10 = new scientific(val5);
            System.out.println("sqrt("+val5+") is : "+obj10.sqrt());
            break;
            case"power":
            System.out.println("Enter the base: ");
            double x=input.nextDouble();
            System.out.println("Enter the power : ");
            double y =input.nextDouble();
            scientific obj11 = new scientific(x,y);
            System.out.println(x+" raised to the power "+y+" is "+obj11.power());
            break;}}else
        {
            
            System.out.println("Invalid input given by the user, try again thank you");
            
        }}}