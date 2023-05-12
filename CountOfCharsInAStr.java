package InterviewPrgs;
import java.util.*;
import java.util.Map.Entry;
public class CountOfCharsInAStr {

	public static void main(String[] args) {
		String str="aaabbbccc";
		char[] ch =str.toCharArray();
		
		Map<Character,Integer> mm = new HashMap<>();
		
		for(char c :ch) {
			if(mm.containsKey(c)) {
				mm.put(c, mm.get(c)+1);
			}
			else {
				mm.put(c, 1);
			}
		}
		System.out.println("map values are" +mm);
	}
}
