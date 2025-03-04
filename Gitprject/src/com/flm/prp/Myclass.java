package com.flm.prp;

public class Myclass {
	
	private void sysout1() {
		// TODO Auto-generated method stub
         System.out.println("hlooooos"+"jjj");
	}
	public static void main(String[] args) {
		int n= 78;
		
		System.out.println(n%2==0);
		System.out.println("hlooooos"+"jjj");
		
		String s="hih";
		String newString="";
		
		int i;
		for(i=s.length()-1;i>=0;i--) {
			
			newString+=String.valueOf(s.charAt(i));
		}
			
		System.out.println(newString);
		if(s.equalsIgnoreCase(newString))
			System.out.println("pal");
		else
			System.out.println("notpal");
	}
	  
}

