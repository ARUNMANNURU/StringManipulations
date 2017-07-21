/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class FindUniqueCharacters {

	/**
	 * @param args
	 */
	
	static boolean allCharactersSame(String str)
	{
	    int n = str.length();
	    char[] ch = str.toCharArray();
	    for (int i = 1; i < n; i++)
	        if (ch[i] != ch[0])
	            return false;
	    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaad";
	    if (allCharactersSame(s))
	        System.out.println("Yes\n");
	    else
	    	System.out.println("No\n");
	}

}
