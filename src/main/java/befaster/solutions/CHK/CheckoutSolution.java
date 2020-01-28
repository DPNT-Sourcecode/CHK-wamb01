package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	
    	 char[] items=skus.toCharArray();
    	 int totalprice=0;
    	 int countA=0;
    	 int countB=0;
    	 for(char c:items) {
    		 
    		 if(!ItemPrice.itemprice.containsKey(c))
    	    		return -1;
    		 else
    			 {
    			 if(c=='A') countA++;
    			 if(c=='B') countB++;
    			 totalprice=totalprice+ItemPrice.itemprice.get(c);
    			 }

    	 }
    	 if(countA==3) {
    		 totalprice=totalprice-20;
    	 } if(countB==2){
    		 totalprice=totalprice-15;

    	 }
    	 return totalprice;
    	 
    }
}


