package com.sonartest.SonarTest;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.INTERNAL;

/**
 * Hello world!
 *
 */
public class App
{
	
    public App() {
		System.out.println("Hi");
	}
    
    public void test() {
    	List<Integer> val = new ArrayList<Integer>();
    	val.add(1);
    	val.add(2);
    }

	public static void main( String[] args )
    {
	
        System.out.println( "Hello shibashankar.. Welcome here..." );
	System.out.println( "Calling Parent objesct..." );
        App ap = new App();
        ap.test();
        
    }
}
