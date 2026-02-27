#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int N;
    char c;
    int sum = 0;

    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> c;
        sum += c - '0';
    }

    cout << sum << "\n";
    return 0;
}