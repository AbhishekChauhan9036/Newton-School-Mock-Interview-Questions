public class Main {
	static final int SIZE = 26;
	static void StringFreq(String str)
	{
		int n = str.length();
		int[] freq = new int[SIZE];
		for (int i = 0; i < n; i++)
			freq[str.charAt(i) - 'a']++;


		for (int i = 0; i < n; i++) {

			if (freq[str.charAt(i) - 'a'] != 0) {

				System.out.println(str.charAt(i)+"->"+freq[str.charAt(i) - 'a'] + " ");
				freq[str.charAt(i) - 'a'] = 0;
			}
		}
	}

	public static void main(String args[])
	{
		String str = "aaaabbddsaonp";
		StringFreq(str);
	}
}