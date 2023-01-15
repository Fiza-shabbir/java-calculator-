package oop;

public class scientific extends calculator{
    scientific(int a){
    super(a);
    }

    scientific(double a, double b, double c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double sin()
    {double ansa;
        return ansa = Math.sin(super.val1);
    }
    public double cos()
    {double ansb;
        return ansb = Math.cos(super.val1);
    }
    public double tan()
    {double ansc;
        return ansc = Math.tan(super.val1);
    }
    public double sqrt()
    {double ansc;
        return ansc = Math.sqrt(super.val1);
    }
    
    scientific(double a,double b){
    super(a,b);
     }
    public double power()
    {
        double ansc;
        return ansc = Math.pow(super.val1,super.val2 );
    }
    
    public void quad()
    {
        double a[] = new double [3];
      a[0]=super.val1;
      a[1]=super.val2;
      a[2]=super.val3;
      double dis=(Math.pow(a[1],2)-4*a[0]*a[2]);
     double quad1=(-a[1]-(Math.pow(dis,0.5))/2*a[0]);
     double quad2=(-a[1]+(Math.pow(dis,0.5))/2*a[0]);
     System.out.println("Quadratic roots are  : "+quad1+" and "+quad2);
    }
    public double log()
    {double log;
        return log = Math.log10(super.val1);
    }
}
