package InterviewPrgs;
import java.util.*;
public class CountNoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is Chaitu";
		String newstr=str.trim();  //it is used to remove leading and trailing spaces
		/*String []count= newstr.isEmpty() ? null : newstr.split("\\s+");
		for(String s : count) {
			System.out.println(s);
		}*/
		
	 int count =newstr.isEmpty() ? 0 : newstr.split("\\s+").length; 
		System.out.println("No of words in a string" +count);
		

	}

}
