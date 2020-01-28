package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    	
    	 char[] items=skus.toCharArray();
    	 int totalprice = 0;
    	 
    	 
    	 Map<Character, Integer> itemCount=new HashMap<Character, Integer>();
    	 
    	 for(char c:items) {
    		 
    		 if(!ItemPrice.itemprice.containsKey(c))
    	    		return -1;
    		 else {
    			 if(itemCount.containsKey(c)) {
          			  itemCount.put(c,itemCount.get(c)+1);

    			 }else {
       			  itemCount.put(c,1);
 
    			 }
    		 }
			/*
			 * else { if(c=='A') countA++; if(c=='B') countB++; if(c=='E') countE++;
			 * 
			 * if(countA==3 ) { totalprice=totalprice+130-3*50; countA=0; }
			 * 
			 * if(countB==2){ totalprice=totalprice+45- 2*30; countB=0; } if(countE==2) {
			 * totalprice=totalprice-ItemPrice.itemprice.get('B'); countE=0; }
			 * totalprice=totalprice+ItemPrice.itemprice.get(c); }
			 */

    	 }
    	for(Map.Entry<Character, Integer> value:itemCount.entrySet()) {
    		
    		if(value.getKey()=='A') {
    			
    			int count=value.getValue();
    			while(count>=3) {
    			if(count>=5) {
    				totalprice=totalprice+200;
    				count=count-5;
    			}
    			else if(count>=3) {
    				totalprice=totalprice+130;
    				count=count-3;
    			}
    			}
    			totalprice=totalprice+50*count;
    			
    		}
    		if(value.getKey()=='B') {
    			int count=value.getValue();
    			while(count>=2) {
    				
    				totalprice=totalprice+45;
    				count=count-2;

    			}
    			totalprice=totalprice+30*count;

    		}
    		if(value.getKey()=='C') {
    			totalprice=totalprice+20*value.getValue();

    		}
    		if(value.getKey()=='D') {
    			totalprice=totalprice+15*value.getValue();

    		}
    	}
    	 return totalprice;
    	 
    }
}





