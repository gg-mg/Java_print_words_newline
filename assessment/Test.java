package com.fdmgroup.assessment;

import java.util.ArrayList;
import java.util.Arrays;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;



public class Test {

public static void main(String[] args) {

	String str = "A cheetah is a fast animal, an elephant is a big animal";
	int size = 3;

	String[] tokens = str.split("(?<=\\G.{" + size + "})");
	System.out.println(Arrays.toString(tokens));
	//---------------------------------------------------
	//String in = "oogabooga";
	//String val = "2";   // use 4 here to insert spaces every 4 characters
	//String result = in.replaceAll("(.{" + val + "})", "$1 ").trim();
	//System.out.println(result);
	
	
}
    

   }

