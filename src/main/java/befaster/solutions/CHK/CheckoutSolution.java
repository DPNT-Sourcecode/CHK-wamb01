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
    //	for(Map.Entry<Character, Integer> value:itemCount.entrySet()) {
    		
    		if(itemCount.containsKey('A')) {
    			
    			int count=itemCount.get('A');
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
    		if(itemCount.containsKey('B')) {
    			int count=itemCount.get('B');
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
    		if(itemCount.containsKey('C')) {
    			totalprice=totalprice+itemCount.get('C')*ItemPrice.itemprice.get('C');;

    		}
    		if(itemCount.containsKey('D')) {
    			totalprice=totalprice+itemCount.get('D')*ItemPrice.itemprice.get('D');;

    		}
    		if(itemCount.containsKey('E')) {
    			int count=itemCount.get('E');
    			 totalprice=totalprice+count*ItemPrice.itemprice.get('E');

    		}
    		
    		if(itemCount.containsKey('F')) {
    			//FF F FF F
    			int count=itemCount.get('F');
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
    		if(itemCount.containsKey('G')) {
    			
   			 totalprice=totalprice+itemCount.get('G')*ItemPrice.itemprice.get('G');

    		}
    		if(itemCount.containsKey('H')) {
    			int count=itemCount.get('H');
    			
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
    		
    		if(itemCount.containsKey('I')) {
    			
     			 totalprice=totalprice+itemCount.get('I')*ItemPrice.itemprice.get('I');

    		}
    		if(itemCount.containsKey('J')) {
    			
    			 totalprice=totalprice+itemCount.get('J')*ItemPrice.itemprice.get('J');

   		}
    		if(itemCount.containsKey('K')) {
    			int count=itemCount.get('K');
    			while(count>=2) {
    				int reminder=count%2;
    				int quotient=count/2;
    				totalprice=totalprice+120*quotient;
    				count=reminder;

    			}
   			 totalprice=totalprice+count*ItemPrice.itemprice.get('K');

  		}
    	if(itemCount.containsKey('L')) {
  			 totalprice=totalprice+itemCount.get('L')*ItemPrice.itemprice.get('L');

    	}
    	if(itemCount.containsKey('M')) {
    		int count=itemCount.get('M');
    		if(itemCount.containsKey('N')) {
				
				int countN=itemCount.get('N');
				if(countN>=3) {
					int quotient=countN/3;
					count=count-quotient;
				}
			}
 			 totalprice=totalprice+count*ItemPrice.itemprice.get('M'); 
    	}
    	if(itemCount.containsKey('N')) {
			 totalprice=totalprice+itemCount.get('N')*ItemPrice.itemprice.get('N'); 
   	}
    	if(itemCount.containsKey('O')) {
			 totalprice=totalprice+itemCount.get('O')*ItemPrice.itemprice.get('O'); 
  	}
    	if(itemCount.containsKey('P')) {
    		int count=itemCount.get('P');
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
    if(itemCount.containsKey('Q')) {
    	int count=itemCount.get('Q');
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
    if(itemCount.containsKey('R')) {
    	totalprice=totalprice+itemCount.get('R')*ItemPrice.itemprice.get('R'); 
    }
    
    if(itemCount.containsKey('U')) {
    	int count=itemCount.get('U');
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
    if(itemCount.containsKey('V')) {
    	int count=itemCount.get('V');
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
    if(itemCount.containsKey('W')) {
    	totalprice=totalprice+itemCount.get('W')*ItemPrice.itemprice.get('W'); 

    }
  
    int countS=0,countT = 0,countX = 0,countY = 0,countZ=0;
    if(itemCount.containsKey('S')) {
    	countS=itemCount.get('S');
    	}
    	if(itemCount.containsKey('T')) {
    		 countT=itemCount.get('T');
    	}
    	if(itemCount.containsKey('X')) {
    		 countX=itemCount.get('X');
    	}
    	if(itemCount.containsKey('Y')) {
    		 countY=itemCount.get('Y');
    	}
    	if(itemCount.containsKey('Z')) {
    		 countZ=itemCount.get('Z');
    	}
    	int countSTXYZ=countS+countT+countX+countY+countZ;
    	boolean flag=false;
        if(countSTXYZ>=3) {
        	
        	
    			int reminder=countSTXYZ%3;
    			int quotient=countSTXYZ/3;
    			if(reminder==0) {
          			 totalprice=totalprice+quotient*45;
          			countSTXYZ=countSTXYZ-3*quotient;
    			}else {
    				
          			 totalprice=totalprice+quotient*45;
          			countSTXYZ=reminder;
          			flag=true;
    			}
    		
        }else {
        	
        	if(itemCount.containsKey('S')) {
            	countS=itemCount.get('S');
            	totalprice=totalprice+countS*ItemPrice.itemprice.get('S'); 

            	}
            	if(itemCount.containsKey('T')) {

                	totalprice=totalprice+countT*ItemPrice.itemprice.get('T'); 

            	}
            	if(itemCount.containsKey('X')) {

                	totalprice=totalprice+countX*ItemPrice.itemprice.get('X'); 

            	}
            	if(itemCount.containsKey('Y')) {

                	totalprice=totalprice+countY*ItemPrice.itemprice.get('Y'); 

            	}
            	if(itemCount.containsKey('Z')) {

                	totalprice=totalprice+countZ*ItemPrice.itemprice.get('Z'); 

            	}
        }
        if(flag) {
        	// Assuming in remaining combination customer have to pay lowest cost of product 
        	if(countSTXYZ==1) {
        	totalprice=totalprice+countSTXYZ*ItemPrice.itemprice.get('Y');
        	}else {
            	totalprice=totalprice+ItemPrice.itemprice.get('Y')+17;

        	}
        }
    	 return totalprice;
    	 
    }
}
