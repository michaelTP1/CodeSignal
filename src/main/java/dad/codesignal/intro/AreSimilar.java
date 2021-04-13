package dad.codesignal.intro;

public class AreSimilar {

	boolean areSimilar(int[] a, int[] b) {
	    boolean ans=false;
	    int swapPairs[]=new int[4];
	    int aux=0;
	    try{
	        if(a.length==b.length){
	            for(int i=0;i<a.length;i++){
	                if(a[i]!=b[i]){
	                    swapPairs[aux++]=a[i];
	                    swapPairs[aux++]=b[i];
	                }
	            }
	            if(swapPairs[0]==swapPairs[3]&&swapPairs[1]==swapPairs[2]){
	                ans= true;
	            }
	        }else{
	            ans= false;
	        }
	        return ans;
	    }catch(IndexOutOfBoundsException e){
	        return false;
	    }
	}

}
