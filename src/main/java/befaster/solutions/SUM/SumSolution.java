package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) throws Exception {
    	
    	if(x>=0 && y>=0)
    	return x+y;
    	throw new Exception("invalid parameter");
    	
    }

}


