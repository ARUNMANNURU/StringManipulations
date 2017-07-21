/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class IntegerOrString {

	/**
	 * @param args
	 */
	static boolean isNumber(String str)
	{
		char[] ch = str.toCharArray();
	    for (int i = 0; i < str.length(); i++)
	        if (Character.isDigit((ch[i])) == false)
	            return false;
	 
	    return true;
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Saving the input in a string
	    String str = "6790D";
	 
	    // Function returns 1 if all elements
	    // are in range '0-9'
	    if (isNumber(str))
	       System.out.println("Integer");
	 
	    // Function returns 0 if the input is
	    // not an integer
	    else
	      System.out.println("String");
		
	}

}
