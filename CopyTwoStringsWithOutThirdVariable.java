package InterviewPrgs;
import java.util.*;
public class CopyTwoStringsWithOutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hii";
		String str2="hello";
		
		str1 = str1 .concat(str2);
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}

}
