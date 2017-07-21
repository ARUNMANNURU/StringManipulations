/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class MinFlips {

	/**
	 * @param args
	 */
	// To find min number of flips in binary string
    static int findFlips(String str, int n)
    {
        char last = ' '; int res = 0;
 
        for (int i = 0; i < n; i++) {
 
            // If last character is not equal
            // to str[i] increase res
            if (last != str.charAt(i))
                res++;
            last = str.charAt(i);
        }
 
        // To return min flips
        return res / 2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "00011110001110";
        int n = str.length();
 
        System.out.println(findFlips(str, n));
	}

}
