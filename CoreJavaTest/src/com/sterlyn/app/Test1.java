package com.sterlyn.app;

import java.io.IOException;

public class Test1 {
	
/*	public static void doIt(int x, int y, int m) {
		if(x==5) m=y;
		else m=x;
			
	}
*/
	public static void main(String[] args){
		/*int x=8,y=8,z=9;
		doIt(x, y, z);
		//System.out.println(z);
*/		
		
/*		
		
		try {
			badMethod();
			System.out.println("A");
		}
		catch (Exception e) {
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");
		
		*/
		
		
	/*	try {
			int h=0;
			for(h=1; h<4;h++);
				System.out.println(h);
		} catch (Exception e) {
			
		}
		finally {
			System.out.println("Error");
		}
		
*/
		
		System.out.println(badMethod());
		
		
		
	}
	

	
	public static int badMethod() {
		try {
			throw new IOException("..");
		} catch (RuntimeException e) {
			throw new RuntimeException(e);
		}
		finally {
			return -1;
		}
		
	}


}
