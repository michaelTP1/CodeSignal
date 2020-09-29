package dad.codesignal.intro;

public class MatrixElementsSum {
	int matrixElementsSum(int[][] matrix) {
	    int sum=0;
	    boolean eq0=false;    
	    
	       for(int j=0;j<matrix[0].length;j++){
	           eq0=false;
	           for(int i=0;i<matrix.length&&!eq0;i++){
	               sum+=matrix[i][j];
	               if(matrix[i][j]==0)
	                   eq0=true;
	  
	               }
	            }
	    
	    return sum;
	        
	}

}
