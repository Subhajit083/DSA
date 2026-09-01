class Solution {
    int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit =n%10;
            n/=10;
            if(digit==0){
                digit=5;
            }
            rev=rev*10+digit;
        }
        return rev;
    }
    public int convertFive(int n) {
        // code here
        if(n==0) return 5;
        int x=reverse(n);
        return reverse(x);
       
}
}