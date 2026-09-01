class Solution {
    public int sumOfDigit(int n){
        int sum =0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int productOfDigit(int n){
        int mul=1;
        while(n!=0){
            mul*=n%10;
            n/=10;
            
        }
        return mul;
    }
    public boolean checkSpy(int n) {
        // code here
        return sumOfDigit(n)==productOfDigit(n);
    }
}

