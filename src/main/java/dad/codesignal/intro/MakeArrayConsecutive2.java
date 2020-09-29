package dad.codesignal.intro;

public class MakeArrayConsecutive2 {
	int makeArrayConsecutive2(int[] statues) {
		int min, aux=0,max;
		boolean auxB=false;
		    min=statues[0];
		    max=min;
		    for(int i=1;i<statues.length;i++){
		        if(min>statues[i])
		            min=statues[i];
		        if(max<statues[i])
		            max=statues[i];
		    }
		   
		    while(min<max){
		         auxB=false;
		        for(int i=0;i<statues.length&&!auxB;i++)
		           if(min==statues[i])
		               auxB=true;
		        min++;
		         if(!auxB)
		            aux++;
		      
		    }
		    
		    return aux;
		}
}
