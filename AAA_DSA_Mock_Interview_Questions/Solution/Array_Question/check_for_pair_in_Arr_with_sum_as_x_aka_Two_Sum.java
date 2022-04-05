class Main{
static boolean chkPair(int A[], int size, int x) {
	for (int i = 0; i < (size - 1); i++) {
		for (int j = (i + 1); j < size; j++) {
			if (A[i] + A[j] == x) {
				System.out.println( A[i] + " " + A[j]);

				return true;
			}
		}
	}
	return false;
}

public static void main(String [] args) {
	
	int A[] = {0, -1, 2, -3, 1};
	int x = -2;
	int size = A.length;
    chkPair(A,size,x);
}
}