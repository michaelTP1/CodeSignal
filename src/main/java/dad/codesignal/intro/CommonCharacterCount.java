package dad.codesignal.intro;

import java.util.ArrayList;

public class CommonCharacterCount {
	int commonCharacterCount(String s1, String s2) {
	    ArrayList<Character> a1=new ArrayList<Character>(), a2=new ArrayList<Character>();
	    int[] rep1, rep2;
	    int counter=0;
	   
	    for(int i=0;i<s1.length();i++){
	        if(!a1.contains(s1.charAt(i)))
	           a1.add(s1.charAt(i));
	    }
	    
	    rep1=new int[a1.size()];
	    
	    for(int i=0;i<rep1.length;i++)
	        rep1[i]=0;
	   
	    for(int i=0;i<s1.length();i++){
	        
	      
	            rep1[a1.indexOf(s1.charAt(i))]++;
	    }
	  
	     for(int i=0;i<s2.length();i++){
	        if(!a2.contains(s2.charAt(i)))
	           a2.add(s2.charAt(i));
	    }
	    
	    rep2=new int[a2.size()];
	    
	    for(int i=0;i<rep2.length;i++)
	        rep2[i]=0;
	    
	    for(int i=0;i<s2.length();i++)
	        
	            rep2[a2.indexOf(s2.charAt(i))]++;
	               
	               
	            
	    
	    for(int i=0;i<a1.size();i++){
	        if(a2.contains(a1.get(i)))
	            if(rep1[i]<rep2[a2.indexOf(a1.get(i))]){
	                counter+=rep1[i];
	            } else
	                counter+=rep2[a2.indexOf(a1.get(i))];
	            
	    }
	    return counter;
	    
	}

}
