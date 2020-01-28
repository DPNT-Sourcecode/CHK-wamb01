package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	
    	if(!ItemPrice.itemprice.containsKey(skus))
    		return -1;
    	 
    }
}


