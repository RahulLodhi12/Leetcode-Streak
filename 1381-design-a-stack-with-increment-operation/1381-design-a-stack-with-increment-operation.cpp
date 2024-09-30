class CustomStack {
public:
    vector<int> vec;
    int n;
    int top=-1;
    CustomStack(int maxSize) {
        vec = vector<int>(maxSize);
        n=maxSize;
    }
    
    void push(int x) {
        if(top<n-1){
            top++;
            vec[top]=x;
        }
    }
    
    int pop() {
        if(top>=0){
            int v=vec[top];
            top--;
            return v;
        }
        return -1;
    }
    
    void increment(int k, int val) {
        for(int i=0;i<k and i<n;i++){
            vec[i]+=val;
        }
    }
};

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack* obj = new CustomStack(maxSize);
 * obj->push(x);
 * int param_2 = obj->pop();
 * obj->increment(k,val);
 */