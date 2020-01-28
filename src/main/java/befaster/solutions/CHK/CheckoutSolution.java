package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	
    	 char[] items=skus.toCharArray();
    	 int totalprice=0;
    	 int countA=0;
    	 int countAA=0;

    	 int countB=0;
    	 int countE=0;
    	 for(char c:items) {
    		 
    		 if(!ItemPrice.itemprice.containsKey(c))
    	    		return -1;
    		 else
    			 {
    			 if(c=='A') {countA++,countAA++ };
    			 if(c=='B') countB++;
    			 if(c=='E') countE++;

    			 if(countA==3 ) {
    	    		 totalprice=totalprice+130-3*50;
    	    		countA=0;
    			 } 
    			 if(countB==2){
    	    		 totalprice=totalprice+45- 2*30;
    	    		 countB=0;
    	    	 }
    			 if(countE==2) {
    				 totalprice=totalprice-ItemPrice.itemprice.get('B');
    				 countE=0;
    			 }
    			 totalprice=totalprice+ItemPrice.itemprice.get(c);
    			 }

    	 }
    	
    	 return totalprice;
    	 
    }
}
