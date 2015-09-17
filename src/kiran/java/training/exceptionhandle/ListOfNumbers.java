package kiran.java.training.exceptionhandle;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
    	
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() {
    	PrintWriter out;
    	out = null;
    	
    	try{
    		System.out.println("Entered try statement");
	    	out = new PrintWriter(new FileWriter("OutFile.txt"));
	
	        for (int i = 0; i < SIZE; i++) {
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
	        
	        System.out.println("Success Writtern in the file");
	        
    	}catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: "
                    +  e.getMessage());
                          
    	}catch (IOException e) {
    	    System.out.println("IOException occurs");
    		System.err.println("Caught IOException: " + e.getMessage());
    	
    	}finally{    
    		if (out != null) { 
    	        System.out.println("Closing PrintWriter");
    	        out.close(); 
    	    } else { 
    	        System.out.println("PrintWriter not open");
    	    } 
    	}	
    }
}