package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	
    	 char[] items=skus.toCharArray();
    	 int totalprice=0;
    	 
    	 int countA=0;

    	 int countB=0;
    	 int countE=0;
     Map<Character, Integer> itemsandCount =new HashMap<Character, Integer>();
for(char c:items) {
    		 
    		 if(!ItemPrice.itemprice.containsKey(c))
    	    		return -1;
    		 else
    			 {
    			 if(itemsandCount.containsKey(c)) {
    			 itemsandCount.put(c, itemsandCount.get(c)+1);
    			 }else {
        			 itemsandCount.put(c, 1);
 
    			 }
    			 /*if(c=='A') {countA++;};
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
    			 }*/

    	 }
    	
    		 for(Map.Entry<Character, Integer> val: itemsandCount.entrySet())	 {
    			 
    		 }
    	
    	 return totalprice;
    	 
    }
}






