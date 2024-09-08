// Given a positive integer n, find the nth natural number after removing all the numbers containing the digit 9.
class Solution {
    long findNth(long n) {
        // code here
       long ans =0;
        long p =1;
        while(n>0){
            ans += p*(n%9);
            n=n/9;
            p=p*10;
        }
        return ans;
    }
}
