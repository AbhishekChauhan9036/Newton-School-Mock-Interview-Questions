class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        

        for(int i = 1; i < leftMax.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i-1]);
        }
        
        for(int j = rightMax.length - 2; j >= 0 ; j--){
            rightMax[j] = Math.max(rightMax[j+1], height[j+1]);
        }
        
        int trapped = 0;
        for(int k = 0; k < height.length; k++){
			
            int surplus = Math.min(leftMax[k], rightMax[k]);
            if(surplus > height[k]){
                trapped+=(surplus-height[k]);
            }
        }
        
        return trapped;
    }
}