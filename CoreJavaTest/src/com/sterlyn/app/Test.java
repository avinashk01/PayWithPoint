package com.sterlyn.app;
import java.util.Properties;

class Test{
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.setProperty("pirate", "scurvy");
		String s = p.getProperty("argProp")+" ";
		s += p.getProperty("pirate");
		System.out.println(s);
	}
	
}