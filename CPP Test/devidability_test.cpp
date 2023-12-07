#include <iostream>
using namespace std;
main()
{
    int i,N;
    cout<<"This program will determine the fectors (between 2,3,5,7) of your given Number\n\n";
    cout<<"The number you want to Cheack for:";
    cin >>N;
    cout<<"Fectors: ";
    if (N%2==0)
        cout <<"2 ";
    else if (N%3==0)
        cout <<"3 ";
    else if (N%5==0)
        cout <<"5 ";
    else if (N%7==0)
        cout <<"7 ";
    else
        cout <<"None";
    cout<<"\n";
    return 0;


}
