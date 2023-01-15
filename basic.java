package oop;


	import java.util.Scanner;
	public class basic extends calculator {
	    basic(){
	    super();
	    }
	    basic(double i,double j){
	     super(i,j);
	    }
	    
	    void choice(){
	        System.out.println("enter your choice \n 1-add \n2-sub \n3-mul \n4-div");
	  Scanner input=new Scanner(System.in);
	    String c;
	c=input.nextLine();
	 if (c.equalsIgnoreCase("add")){
	 System.out.println("added answer ="+(super.val1)+super.val2);}
	 else if(c.equalsIgnoreCase("sub")){
	 System.out.println("subtracted answer ="+(super.val1-super.val2));}
	 else if(c.equalsIgnoreCase("mul")){
	 System.out.println("multiplied answer ="+(super.val1*super.val2));}
	 else if(c.equalsIgnoreCase("div")){
	     double division=(super.val1/super.val2);
	 System.out.println("divided answer ="+division);}
	    
	    
	    
	    }
	    
	    
	    
	}

