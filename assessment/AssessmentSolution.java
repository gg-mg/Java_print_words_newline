package com.fdmgroup.assessment;

import java.util.List;
import java.util.ArrayList;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class AssessmentSolution {
	
	private String string;
	int myInt;
	
	
    public static  void wrap( String str, int myInt) 
    { 
    	List<String> results = new ArrayList<String>();
    	//ArrayList<String> results = new ArrayList<String>();Works as well

        int length = str.length();
        
//This loop breaks the string into chunks of myInt characters and stores in an ArrayList
        for(int i = 0; i <= length; i += myInt) {

            if((length - (i + myInt)) > 0) {

                results.add(str.substring(i, i + myInt));
               

            } else {

            	 results.add(str.substring(i, length));
                 
            }
            
        }
//This loop prints each chunk stored in the ArrayList in a new line
        for(int a = 0; a < results.size(); a++) {

            System.out.println(results.get(a));

        }
  
    }
    public String SplitToLines(String stringToSplit, int maximumLineLength)
	{
    	
    	return  stringToSplit.replaceAll("(.{" + maximumLineLength + "})(?:\\s|$)", "$1\n");
	}
    
   //public MatchCollection SplitToLines(string stringToSplit, int maximumLineLength)
    //{
     //   return Regex.Matches(stringToSplit, @"(.{1," + maximumLineLength +@"})(?:\s|$)");
    //}
    
}
