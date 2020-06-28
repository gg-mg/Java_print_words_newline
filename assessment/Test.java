package com.fdmgroup.assessment;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;



public class Test {

	public static void main(String[] args) {

		String str = "A cheetah is a fast animal, an elephant is a big animal";
		int len = 3;
		String str1[] = str.split(",");
		List<String> list = new ArrayList<String>();
		list=Arrays.asList(str1);
	
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str1));	
		arrayList.add(0, "bigger");
  
		for (int i=0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
    

	}
}
