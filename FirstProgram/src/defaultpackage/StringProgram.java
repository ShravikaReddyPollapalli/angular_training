package defaultpackage;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProgram {
public static void main(String[] args) {
	String str = new String("stackroute");
	
	
	System.out.println(str.toUpperCase());
	System.out.println(str.substring(2,4));
	System.out.println(str.contains("s"));
	System.out.println(str.charAt(2));
	
	String str1 = "Stack,,Route;pvt;ltd";
	String[] words = str1.split("[,;]");
	System.out.println(words.length);
	System.out.println(words[3]);
	System.out.println(Arrays.toString(words));
	String str2 = "123"; 
	System.out.println(str2.matches("\\d{3}"));
	System.out.println(str2.matches("\\d+")); 
	char[] cArr = str2.toCharArray(); 
	System.out.println(cArr.length); 
	System.out.println(Arrays.toString(cArr));
	String panNo = "ABCD2456C";
	String regex = "[A-Z]{4}\\d{4}[A-Z]"; 
	System.out.println(panNo.matches(regex));
	String word = " Hello World x,xy ";
	
	String word1 = word.trim().replaceAll("\\s+", " ");
	System.out.println(word1);
	String[] splitted = word.split("\\s+");
	
	System.out.println(Arrays.toString(splitted));
	String line = "Regex and Strings with Pattern And Matcher"; 
	Pattern pattern = Pattern.compile("Strings|Pattern\\s+");
	Matcher matcher = pattern.matcher(line); 
	while(matcher.find()) { System.out.println(matcher.group()); 
	System.out.println(matcher.start()); 
	System.out.println(matcher.end());
	}

}
}
