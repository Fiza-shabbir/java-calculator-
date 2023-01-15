package oop;

public class calculator {
	double val1,val2,val3,val4;
    calculator(){
    val1=0;
    val2=0;
    val3=0;
    }
    calculator(int a){
    this.val1=a;
    }
    
    calculator(double a ,double b ){
    this.val1=a;
    this.val2=b;}
   
    calculator(double a ,double b, double c){
    this.val1=a;
    this.val2=b;
    this.val3=c;
    }
    calculator(int a,int b, int c, int d){
    this.val1=a;
    this.val2=b;
    this.val3=c;
    this.val4=d;
    }
}
