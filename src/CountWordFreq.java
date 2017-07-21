import java.util.Hashtable;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class CountWordFreq {

	/**
	 * @param args
	 */
	
	// Returns count of words with frequency
	// exactly 2.
	static void countWords(String str[])
	{
		int count=1;
		Hashtable<Integer,String> hMap = new Hashtable<Integer,String>();
		for(int i=0; i < str.length; i++){
			String stringValues = str[i];
			if(hMap.containsValue(stringValues)){
				count++;
			}else{
				hMap.put(count,stringValues);
				count++;
			}
		}
		    	System.out.println(hMap.get(2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "hate", "love", "peace", "love",
                "peace", "hate", "love", "peace",
                "love", "peace" };
		countWords(s);
		
	}

}
