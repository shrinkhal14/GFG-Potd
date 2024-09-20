class Solution {
    
    public int countBuildings(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        
        int count = 1; 
        
        int maxHeight = height[0]; 

        for (int i = 1; i < height.length; i++) {
          
            if (height[i] > maxHeight) {
                count++;
               
                maxHeight = height[i];
            }
        }

        return count;
    }
}
