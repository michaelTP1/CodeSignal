package dad.codesignal.intro;

public class AllLongestStrings {
	String[] allLongestStrings(String[] inputArray) {
	    int counter=1, maxsize;
	    maxsize=inputArray[0].length();
	    for(int i=1;i<inputArray.length;i++){
	        if(inputArray[i].length()>maxsize){
	            maxsize=inputArray[i].length();
	            counter=1;
	        }
	       else if(inputArray[i].length()==maxsize)
	            counter++;
	    }
	    String[] s=new String[counter];
	    
	     for(int i=0, j=0;i<inputArray.length;i++){
	         if(inputArray[i].length()==maxsize){
	             s[j]=inputArray[i];
	             j++;
	         }
	     }
	    return s;
	    
	}

}
