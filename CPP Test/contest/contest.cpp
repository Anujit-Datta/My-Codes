#include <bits/stdc++.h>
using namespace std;
#define MAX 7368787
void Primus(vector<long long int>& primes)
{
	bool isPrime[MAX];
	memset(isPrime, true, sizeof(isPrime));
	for (long long int p = 2; p * p < MAX; p++) {
		if (isPrime[p] == true) {
			for (long long int i = p * p; i < MAX; i += p)
				isPrime[i] = false;
		}
	}
	for (long long int p = 2; p < MAX; p++)
		if (isPrime[p])
			primes.push_back(p);
}

int main()
{
	vector<long long int> primes;
    int n;
    cin>>n;
    Primus(primes);
    cout<<primes[n-1];
	return 0;
}


