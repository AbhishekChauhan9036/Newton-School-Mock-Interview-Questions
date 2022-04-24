import java.util.*;
class Main{
static void EditDistDP(String str1, String str2)
{
	int len1 = str1.length();
	int len2 = str2.length();

	int [][]DP = new int[2][len1 + 1];
	for (int i = 0; i <= len1; i++)
		DP[0][i] = i;

	for (int i = 1; i <= len2; i++)
	{
		for (int j = 0; j <= len1; j++)
		{
			if (j == 0)
				DP[i % 2][j] = i;

			else if (str1.charAt(j - 1) == str2.charAt(i - 1)) {
				DP[i % 2][j] = DP[(i - 1) % 2][j - 1];
			}

			else {
				DP[i % 2][j] = 1 + Math.min(DP[(i - 1) % 2][j],Math.min(DP[i % 2][j - 1],DP[(i - 1) % 2][j - 1]));
			}
		}
	}
	System.out.println(DP[len2 % 2][len1]);
}
public static void main(String[] args)
{
	String str1 = "food";
	String str2 = "money";
	EditDistDP(str1, str2);
}
}