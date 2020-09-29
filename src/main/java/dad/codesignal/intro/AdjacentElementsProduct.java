package dad.codesignal.intro;

public class AdjacentElementsProduct {
	int adjacentElementsProduct(int[] inputArray) {
	    int maxProduct=inputArray[0]*inputArray[1];
	for(int i=1;i<inputArray.length-1;i++){
	    if(maxProduct<inputArray[i]*inputArray[i+1])
	        maxProduct=inputArray[i]*inputArray[i+1];
	}
	    return maxProduct;
	}

}
