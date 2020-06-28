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
	
	
	
}
    

   }

