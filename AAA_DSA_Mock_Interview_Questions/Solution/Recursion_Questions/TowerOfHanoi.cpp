#include <bits/stdc++.h>
using namespace std;

void towerOfHanoi(int n, char from_rod,char to_rod, char aux_rod)
{
	if (n == 1)
	{
		cout<<n<<":"<< from_rod <<"->" << to_rod<<endl;
		return;
	}
	towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
	cout<<n<<":"<<from_rod <<"->" << to_rod << endl;
	towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}


int main()
{
	int n;
	cin>>n; 
	towerOfHanoi(n, 'A', 'C', 'B'); 
	return 0;
}