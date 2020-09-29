package dad.codesignal.intro;

public class AlmostIncreasingSequence {
	boolean almostIncreasingSequence(int[] sequence) {
	    boolean aux=true, ans=true;
	    int auxInt,i;
	    
	    if(sequence[0]>=sequence[1]){
	        aux=false;
	        if((sequence.length>2)&&(sequence[1]>=sequence[2]))
	            ans=false;
	        auxInt=1;
	        i=2;
	            
	        } else{
	        auxInt=0;
	        i=1;
	        }
	    
	    for(;(i<sequence.length-1)&ans;i++){
	        if((sequence[i]>=sequence[i+1])||(sequence[auxInt]>=sequence[i])){
	            
	            if(sequence[i-1]>=sequence[i+1]){
	            
	               
	                if(aux)
	                    
	                    aux=false;
	                else
	                    ans=false;
	                auxInt=i;
	            }else
	                if((auxInt!=i-1)&&(sequence[auxInt]>=sequence[i])){
	              
	                 if(aux)
	                aux=false;
	            else
	                ans=false;
	          
	           }
	                     
	        }
	            
	  } 
	     
	    if(!(sequence[sequence.length-1]==auxInt))
	    if(sequence[sequence.length-1]<=sequence[sequence.length-2]){
	        
	         if(!aux)
	            ans=false;
	    }   
	        
	    return ans;

	}
	/*

	boolean almostIncreasingSequence(int[] sequence) {
	    int removed = 0;

	    for (int i = 0; i < sequence.length - 2 && removed <= 2; i ++) {
	        int a = sequence[i];
	        int b = sequence[i+1];
	        int c = sequence[i+2];

	        if (a >= b) {
	            removed++;
	            sequence[i] = b -1;
	        } 

	        if (b >= c){
	            removed++;

	            if (a == c) {
	                sequence[i+2] = b +1;
	            } else {
	                sequence[i+1] = a;
	            }
	        }
	    }

	   return removed <= 1;
	}*/
}
