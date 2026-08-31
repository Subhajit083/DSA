class Solution {
    public long factorial(int n){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public long nPr(int n, int r) {
        // code here
        return factorial(n)/factorial(n-r);
        
    }
}