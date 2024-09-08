//Given an array arr[] of non-negative integers. Each array element represents the maximum length of the jumps that can be made forward from that element.
class Solution {
    public static int minJumps(int[] arr) {
        int n = arr.length;
        int maxReach = 0; 
        int choice = 0;   
        int jumps = 0;   
        for (int i = 0; i < n - 1; i++) {
            
            maxReach = Math.max(maxReach, arr[i] + i);
            
            
            if (i == choice) {
                choice = maxReach;
                jumps++;
            }
            if (choice >= n - 1) return jumps;
        }
        
        
        
        
        return -1;
    }
}
