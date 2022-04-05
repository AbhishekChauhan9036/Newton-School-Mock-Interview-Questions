import java.util.*;
import java.io.*;
public class Main {
public static void Validparentheses(int openP, int closeP, String string) {
		if (openP == 0 && closeP == 0) 
			System.out.println(string);

		if (openP > closeP) 
			return;
            
		if (openP > 0)
			Validparentheses(openP - 1, closeP, string + "("); 

		if (closeP > 0)
			Validparentheses(openP, closeP - 1, string + ")"); 

	}

	public static void printParentheses(int n) {
		Validparentheses(n / 2, n / 2, "");
	}

	public static void main(String[] args) {
		int n = 4;
		printParentheses(n);
	}
}