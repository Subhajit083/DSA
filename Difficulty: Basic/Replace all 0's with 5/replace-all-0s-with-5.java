class Solution {
    public int convertFive(int n) {
        // code here
        if (n==0){
            return 5;
        }
        int ans=0;
        int placeValue=1;
        while(n>0){
            int digit =n%10;
            if(digit==0){
                digit=5;
            }
            ans+=digit*placeValue;
            placeValue*=10;
            n/=10;
        }
        return ans;
    }
}