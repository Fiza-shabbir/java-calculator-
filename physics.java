package oop;
import java.util.Scanner;
public class physics extends calculator {
    physics(double i,double j){
    super(i,j);
    }
    public double DensityFormula()
    {
        double density;
        return density=(super.val1/super.val2);
    }
    
   
     physics(double i,double j,double k){
    super(i,j,k);
    }
      public double AccelerationFormula()
    {
        double acceleration;
        return acceleration = ((super.val1 - super.val2)/super.val3);
    }
     public double ForceFormula()
    {double force;
        return force = super.val1*super.val2;
    }
     physics(int i,int j,int k,int l){
     
     super(i,j,k,l);
     
     }
    public double MagneticFluxFormula()
    {
        double magnetic_flux;
        return magnetic_flux = super.val1*super.val2*super.val3;
    }
   
    
    
    
}
