package dad.codesignal.intro;

public class SortByHeight {
	int[] sortByHeight(int[] a) {
	    int aux;
	    for(int i=0;i<a.length;i++){
	        if(a[i]!=-1)
	        for(int j=0;j<a.length;j++){
	            if(a[j]!=-1&&a[i]<a[j]){
	            aux=a[i];
	            a[i]=a[j];
	            a[j]=aux;
	            }
	        }
	    }
	    return a;

	}

}
