class Solution {
public:
    bool isUgly(int n) {
        if(n<=0) return false;
        if(n==1 or n==2 or n==3 or n==5) return true;

        bool cnt2=0;
        bool cnt3=0;
        bool cnt5=0;
        bool other=0;
        while(n%2==0){
            n=n/2;
            cnt2=1;
        }
        if(n!=1 and n%3!=0 and n%5!=0){
            other=1;
            cout<<"1"<<other<<endl;
        }
        while(n%3==0){
            n=n/3;
            cnt3=1;
        }
        if(n!=1 and n%5!=0){
            other=1;
            cout<<"2"<<other<<endl;
        }
        while(n%5==0){
            n=n/5;
            cnt5=1;
        }
        if(n!=1 and n%5!=0){
            other=1;
            cout<<"3"<<other<<endl;
        }
        if(other) return false;
        return true;
    }
};