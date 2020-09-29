package dad.codesignal.intro;

public class AlternatingSums {
	int[] alternatingSums(int[] a) {
		int[] count=new int[2];
		    for(int i=0;i<a.length;i+=2){
		        count[0]+=a[i];
		    }
		    for(int i=1;i<a.length;i+=2){
		        count[1]+=a[i];
		    }
		    return count;
		        
		}

}
