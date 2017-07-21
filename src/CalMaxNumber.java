/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class CalMaxNumber {

	/**
	 * @param args
	 */
	
	// Mehod to calculate the value
    static int calcMaxValue(String str)
    {
        // Store first character as integer
        // in result
        int res = str.charAt(0) -'0';
      
        
        // Start traversing the string
        for (int i = 1; i < str.length(); i++)
        {
            // Check if any of the two numbers
            // is 0 or 1, If yes then add current
            // element
            if (str.charAt(i) == '0' || str.charAt(i) == '1' ||
                str.charAt(i-1) == '0' || str.charAt(i-1) == '1' )
                res += (str.charAt(i)-'0');
      
            // Else multiply
            else
                res *= (str.charAt(i)-'0');
        }
      
        // Return maximum value
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "01891";
        System.out.println(calcMaxValue(str));
	}

}
