package com.fdmgroup.assessment;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		String str = "The cheetah is the fastest animal on land, a hare looks like a bunny";
			int colLength = 10;
	AssessmentSolution list= new AssessmentSolution();
		
		AssessmentSolution.wrap(str,colLength);
		
		AssessmentSolution asolution = new AssessmentSolution();
		System.out.println(asolution.SplitToLines(str, colLength)) ;
   }

}	

	

