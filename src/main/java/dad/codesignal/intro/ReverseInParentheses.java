package dad.codesignal.intro;

public class ReverseInParentheses {
	String reverseInParentheses(String inputString) {
	    
	    
	 
	    int openParenthesisIndex, index;
	    String ans="";
	    if(inputString.contains(")")){
	        do{
	            ans="";
	        
	            index=inputString.indexOf(')');
	            openParenthesisIndex=inputString.substring(0,index).lastIndexOf('(');
	               
	            for(int i=0;i<inputString.length();i++){
	                if(i!=openParenthesisIndex)
	                    ans+=inputString.charAt(i);
	                else{

	                    for(int j=index-1;j>openParenthesisIndex;j--){
	                        ans+=inputString.charAt(j);
	                    }
	                    i=index;
	                }        
	            }
	            inputString=ans;
	            System.out.println(ans);
	        
	        }while(ans.contains(")"));
	    }
	    else
	        ans=inputString;
	    return ans;    
	}

}
