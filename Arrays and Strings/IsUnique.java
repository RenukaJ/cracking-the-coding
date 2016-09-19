package crackingthecoding;

public class IsUnique {

	private String s;
	
	public boolean isUnique(String s){
		if(s.length()>128) //if length of the string is greater than 128 that means some characters are repeated for sure, so return false right away.
			return false;
		
		boolean[] char_set = new boolean[128]; //by default all the values in array are assigned to false values.
		for(int i=0; i<s.length(); i++){
			int val = s.charAt(i);
			if(char_set[val]){  //checks if the position in the array is set to true
				return false;	//already found this character in string so return false
			}
			char_set[val]=true;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsUnique i=new IsUnique();
		String s="abcdd";
		boolean result = i.isUnique(s);
		if(result == true){
			System.out.println("String "+s+" is unique");
		}	
		else
		System.out.println("String "+s+" is not unique");
	}

}
