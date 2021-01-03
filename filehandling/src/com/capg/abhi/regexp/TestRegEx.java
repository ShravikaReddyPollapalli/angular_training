package com.capg.abhi.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//how to work with regexp
public class TestRegEx {
public static void main(String[] args) {
	//pattern and matcher class 
	//matchresult interafce  matcher is impli class
	
	//first creating a pattern      //. reperesents only one character
	Pattern p =  Pattern.compile(".bhi");
	  Matcher matcher = p.matcher("abhi"); //true
                                     //	   abhilash false
	  System.out.println(matcher.matches());
	  
	  System.out.println(Pattern.matches(".bhi", "$bhi"));
	//to create our own pattern we need so much knoledge
	  //serach email regex in java for email validation in project
	    //get from google for email validation
	  //get password from google explanation from geeksforgeeks
	  
	  
	  
}
}
