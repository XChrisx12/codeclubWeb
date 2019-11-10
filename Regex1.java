import java.util.Scanner;
import java.lang.*;
import java.util.regex.*;
import java.util.Arrays;

public class Regex1{
	public static void main(String[] args) {
		String emails = "guidif34@gmail.com fjfj656@hotmail.com djdjgmail.com  djd13@gmail.net";
		String phoneNum = "234.256.4546 548-852-9511 5455.15135 (345)-445-4544 222m2225n4569" ;
		String names = " Mr Chris Mr. Hong Ms Riley Mrs Smith Mr. Y";


		 regexchecker("[A-Za-z0-9]{3,}@[a-z]+.(com|net)", emails);
		 //prints- guidif34@gmail.com fjfj656@hotmail.com djd13@gmail.net
		 System.out.println();
		 
		 regexchecker("((\\(\\d{3}\\))|\\d{3})( |-|\\.)\\d{3}( |-|\\.)\\d{4}", phoneNum);
		 //prints-  234.256.4546 548-852-9511 (345)-445-4544
		 System.out.println();
		 regexchecker("M(r|s|rs)(\\.)? [A-Z]([a-z]+)?", names);
		 //prints-  Mr Chris Mr. Hong Ms Riley Mrs Smith Mr. Y
	}
	  public static void regexchecker(String theRegex, String string2check){
			Pattern rule = Pattern.compile(theRegex);
			Matcher regexMatch = rule.matcher(string2check);
			
			while (regexMatch.find()){
				if (regexMatch.group().length() !=0 ){
					System.out.print(" "+ regexMatch.group().trim() );
				}
		 
		}
	}


}

		/*
		In regex expressions:
		
		. represents all characters except spaces.
		use /(followd by a char) to represent the literal character. Example /. searches for "." instead of its regex meaning of every character except for space
		[] Indicate the possibility of characters being searched for at one position.
		{n,m} minimum and maximum range of the subject. n is minimum and m is maximum.


word that is 2 to 20 characters in length:
	[A-Za-z]{2,20} 
	[A-Za-z] characters from A through Z or from a-z.
	{2,20} represents minimun and maximum range of length of the subject. n-minimmum m-maximum.
*/
