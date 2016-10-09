/*
 * author Renuka Joshi
 * Program - Check Permutation: given two strings, write a method to decide if one is a permutation of other.
 */

package crackingthecoding;

import java.util.HashSet;

public class CheckPermutation {

	public boolean CheckIfPermutation(String str1, String str2){
		if(str1.length() != str2.length()) return false;
		
		HashSet<Character> hset = new HashSet<>();
		for(int i=0; i<str1.length(); i++){
			hset.add(str1.charAt(i));
		}
		
		for(int i=0; i<str2.length(); i++){
			if(!hset.contains(str2.charAt(i)))
				return false;
		}

		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//test commit
		
		String str1="teachers", str2="cheater";
		CheckPermutation cp = new CheckPermutation();
		boolean result = cp.CheckIfPermutation(str1, str2);
		if(result == true)
			System.out.println("Strings "+str1+" and "+str2+" are permutation of one another");
		else
			System.out.println("Strings "+str1+" and "+str2+" are not permutation of one another");
	}

}
