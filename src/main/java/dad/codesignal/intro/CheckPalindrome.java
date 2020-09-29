package dad.codesignal.intro;

public class CheckPalindrome {
	boolean checkPalindrome(String inputString) {
	    boolean ans=true;
	    
	for (int i=0, j=inputString.length()-1; ans && (i<j); i++, j--){
	    if(inputString.charAt(i)!=inputString.charAt(j))
	        ans=false;
	}
	    return ans;
	}



}
