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

    	 }
    	for(Map.Entry<Character, Integer> value:itemCount.entrySet()) {
    		
    		if(value.getKey()=='A') {
    			
    			int count=value.getValue();
    			while(count>=3) {
    			if(count>=5) {
    				int reminder=count%5;
    				int quotient=count/5;
    				totalprice=totalprice+200*quotient;
    				count=reminder;
    			}
    			else if(count>=3) {
    				int reminder=count%3;
    				int quotient=count/3;
    				totalprice=totalprice+130*quotient;
    				count=reminder;
    			}
    			}
    			totalprice=totalprice+count*ItemPrice.itemprice.get('A');;
    			
    		}
    		if(value.getKey()=='B') {
    			int count=value.getValue();
    			//Check if product list contains more than 2E
    			if(itemCount.containsKey('E')) {
    				
    				int countE=itemCount.get('E');
    				if(countE>=2) {
    					int quotient=countE/2;
    					count=count-quotient;
    				}
    			}
    			while(count>=2) {
    				int reminder=count%2;
    				int quotient=count/2;
    				totalprice=totalprice+45*quotient;
    				count=reminder;

    			}
    			totalprice=totalprice+count*ItemPrice.itemprice.get('B');;

    		}
    		if(value.getKey()=='C') {
    			totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('C');;

    		}
    		if(value.getKey()=='D') {
    			totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('D');;

    		}
    		if(value.getKey()=='E') {
    			int count=value.getValue();
    			 totalprice=totalprice+count*ItemPrice.itemprice.get('E');

    		}
    		
    		if(value.getKey()=='F') {
    			//FF F FF F
    			int count=value.getValue();
    			 if(count>=3) {
    				int reminder=count%2;
    				int quotient=count/2;
                     if(reminder==0)
 					count=count-(quotient-1);
                     else
  					count=count-(quotient);

 				}
    			 totalprice=totalprice+count*ItemPrice.itemprice.get('F');


    		}
    		if(value.getKey()=='G') {
    			
   			 totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('G');

    		}
    		if(value.getKey()=='H') {
    			int count=value.getValue();
    			
    			if(count>=10) {
    				int reminder=count%10;
    				int quotient=count/10;
    				if(reminder==0) {
    	      			 totalprice=totalprice+quotient*80;
                         count=count-10*quotient;
    				}else {
    					
    					totalprice=totalprice+quotient*80;
    	      			count=reminder;
    				}
    			}
    			if(count>=5) {
    				int reminder=count%5;
    				int quotient=count/5;
    				if(reminder==0) {
    	      			 totalprice=totalprice+quotient*45;
                         count=count-5;
    				}else {
    					
    	      			 totalprice=totalprice+quotient*45;
    	      			count=reminder;
    				}
    			}
      			 totalprice=totalprice+count*ItemPrice.itemprice.get('H');

       		}
    		
    		if(value.getKey()=='I') {
    			
     			 totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('I');

    		}
    		if(value.getKey()=='J') {
    			
    			 totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('J');

   		}
    		if(value.getKey()=='K') {
    			int count=value.getValue();
    			while(count>=2) {
    				int reminder=count%2;
    				int quotient=count/2;
    				totalprice=totalprice+150*quotient;
    				count=reminder;

    			}
   			 totalprice=totalprice+count*ItemPrice.itemprice.get('K');

  		}
    	if(value.getKey()=='L') {
  			 totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('L');

    	}
    	if(value.getKey()=='M') {
    		int count=value.getValue();
    		if(itemCount.containsKey('N')) {
				
				int countN=itemCount.get('N');
				if(countN>=3) {
					int quotient=countN/3;
					count=count-quotient;
				}
			}
 			 totalprice=totalprice+count*ItemPrice.itemprice.get('M'); 
    	}
    	if(value.getKey()=='N') {
			 totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('N'); 
   	}
    	if(value.getKey()=='O') {
			 totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('O'); 
  	}
    	if(value.getKey()=='P') {
    		int count=value.getValue();
    		if(count>=5) {
				int reminder=count%5;
				int quotient=count/5;
				if(reminder==0) {
	      			 totalprice=totalprice+quotient*200;
                     count=count-5*quotient;
				}else {
					
	      			 totalprice=totalprice+quotient*200;
	      			count=reminder;
				}
			}
			 totalprice=totalprice+count*ItemPrice.itemprice.get('P'); 
 	}
    if(value.getKey()=='Q') {
    	int count=value.getValue();
    	if(itemCount.containsKey('R')) {
			
			int countN=itemCount.get('R');
			if(countN>=3) {
				int quotient=countN/3;
				count=count-quotient;
			}
		}
    	if(count>=3) {
			int reminder=count%3;
			int quotient=count/3;
			if(reminder==0) {
      			 totalprice=totalprice+quotient*80;
                 count=count-3*quotient;
			}else {
				
      			 totalprice=totalprice+quotient*80;
      			count=reminder;
			}
		}
		 totalprice=totalprice+count*ItemPrice.itemprice.get('Q'); 

    	
    }
    if(value.getKey()=='R') {
    	totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('R'); 
    }
    if(value.getKey()=='S') {
    	int countS=value.getValue();
    	totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('S'); 
    }
    if(value.getKey()=='T') {
    	totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('T'); 
    }
    if(value.getKey()=='U') {
    	int count=value.getValue();
    	if(count>3) {
			int reminder=count%3;
			int quotient=count/3;
			if(reminder==0) {
      			 totalprice=totalprice+quotient*80;
                 count=count-3;
			}else {
				
      			 totalprice=totalprice+quotient*80;
      			count=reminder;
			}
		}
    	totalprice=totalprice+count*ItemPrice.itemprice.get('U'); 
    }
    if(value.getKey()=='V') {
    	int count=value.getValue();
    	if(count>=3) {
			int reminder=count%3;
			int quotient=count/3;
			if(reminder==0) {
      			 totalprice=totalprice+quotient*130;
                 count=count-3*quotient;
			}else {
				
      			 totalprice=totalprice+quotient*130;
      			count=reminder;
			}
		}
    	if(count>=2) {
			int reminder=count%2;
			int quotient=count/2;
			if(reminder==0) {
      			 totalprice=totalprice+quotient*90;
                 count=count-2*quotient;
			}else {
				
      			 totalprice=totalprice+quotient*90;
      			count=reminder;
			}
		}
    	
    	totalprice=totalprice+count*ItemPrice.itemprice.get('V'); 

    }
    if(value.getKey()=='W') {
    	totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('W'); 

    }
    if(value.getKey()=='X') {
    	totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('X'); 

    }
    if(value.getKey()=='Y') {
    	totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('Y'); 

    }
    if(value.getKey()=='Z') {
    	totalprice=totalprice+value.getValue()*ItemPrice.itemprice.get('Z'); 

    }
    	}
    	 return totalprice;
    	 
    }
}



