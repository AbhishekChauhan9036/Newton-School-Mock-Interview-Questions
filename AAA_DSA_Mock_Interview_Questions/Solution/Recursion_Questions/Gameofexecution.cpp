#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int josephus(int n, int k)
{
	if (n == 1)
		return 1;
	else
		return (josephus(n - 1, k) + k - 1) % n + 1;
}


int main()
{
	int t;
	cin>>t;
	for(int i=0;i<t;i++){
		int n;
		int k;
		cin>>n>>k;
	cout<< josephus(n, k)<<endl;
	}
	return 0;
}