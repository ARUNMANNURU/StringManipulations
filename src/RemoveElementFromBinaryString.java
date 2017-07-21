/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class RemoveElementFromBinaryString {

	/**
	 * @param args
	 */
	
	static int xorZero(String s)
    {
        int one_count = 0, zero_count = 0;
        char[] str=s.toCharArray();
        int n = str.length;
      
        // Counting number of 0 and 1
        for (int i = 0; i < n; i++)
            if (str[i] == '1')
                one_count++;
            else
                zero_count++;
          
        // If count of ones is even
        // then return count of zero
        // else count of one
        if (one_count % 2 == 0)
            return zero_count;
        return one_count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String s = "11111";
        System.out.println(xorZero(s));  
	}

}
