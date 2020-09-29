package dad.codesignal.intro;

public class AddBorder {
	String[] addBorder(String[] picture) {
	    
	    String aux="";
	    
	    String[] ans=new String [picture.length+2];
	    int i;
	     
	    for(int j=0;j<picture[0].length();j++){
	        aux+="*";
	    }
	   
	    ans[0]='*'+aux+'*';
	    for(i=0;i<picture.length;i++){
	        ans[i+1]='*'+picture[i]+'*';
	    }
	    ans[i+1]='*'+aux+'*';
	    
	       return ans; 

	}

}
