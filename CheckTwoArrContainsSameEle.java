package InterviewPrgs;
import java.util.*;
public class CheckTwoArrContainsSameEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Integer [] a1 = {1,2,3,4};
		Integer [] a2= {1,2,3,4};
		
		System.out.print(sameEle(a1,a2));
	}
	
	public static boolean sameEle(Object []arr1, Object []arr2) {
		
		Set<Object> s1 = new HashSet<>((Collection)Arrays.asList(arr1));
		Set<Object> s2 = new HashSet<>((Collection)Arrays.asList(arr2));
		
		if(s1.size()!= s2.size()) {
				return false;
			}
			
		for(Object o : s1) {
			if(s2.contains(s1)){
				return true;
			}
			else {
				return false;
			}
		}
			
	
		
		return true;
		
	}
	
	
	

}
