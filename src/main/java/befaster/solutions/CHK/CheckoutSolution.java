package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	
    	 char[] items=skus.toCharArray();
    	 int count=0;
    	 for(char c:items) {
    		 
    		 if(!ItemPrice.itemprice.containsKey(c))
    	    		return -1;
    		 else
    			 count++;

    	 }
    	 return count;
    	 
    }
}



