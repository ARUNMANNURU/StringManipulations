/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class BalPositionString {

	/**
	 * @param args
	 */
	
static final int MAX_CHAR = 256;
    
    // method to return number of balancing points
    static int countBalance(String s)
    {
    	char[] str=s.toCharArray();
    	int n = str.length; // string length
    	
    
    	// hash array for storing hash of string
    	// intialized by 0 being global
    	int[] rightVisited = new int[MAX_CHAR];
    	int[] leftVisited = new int[MAX_CHAR];
    
    	// process string initially for rightVisited
    	for (int i=0; i<n; i++)
    		rightVisited[str[i]]++;
    
    	// check for balancing points
    	int res = 0;
    	for (int i=0; i<n; i++)
    	{
    		// for every position inc left hash
    		// & dec rightVisited
    		leftVisited[str[i]]++;
    		rightVisited[str[i]]--;
    
    		// check whether both hash have same
    		// character or not
    		int j;
    		for (j=0; j<MAX_CHAR; j++)
    		{
    			// Either both leftVisited[j] and
    			// rightVisited[j] should have none
    			// zero value or both should have
    			// zero value
    			if ( (leftVisited[j] == 0 &&
    				rightVisited[j] != 0) ||
    				(leftVisited[j] != 0 &&
    				rightVisited[j] == 0)
    			)
    				break;
    		}
    
    		// if both have same character increment
    		// count
    		if (j == MAX_CHAR)
    			res++;
    	}
    	return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaababa";
		System.out.println(countBalance(str));
	}

}
