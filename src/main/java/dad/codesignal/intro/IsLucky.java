package dad.codesignal.intro;

public class IsLucky {
	boolean isLucky(int n) {
	    int sum1=0, sum2=0;
	   
	    String s=""+n;
	    
	    for(int i=0, j=s.length()-1;i<j;i++,j--){
	        sum1+=s.charAt(i);
	        sum2+=s.charAt(j);
	    }
	    
	    return sum1==sum2;
	}

}
