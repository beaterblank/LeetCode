//medium
class Solution {
    public int maxArea(int[] height) {
        //using two pointer method to solve
        int start = 0;
        int end = height.length-1;
        int max = 0;
        while(start<end){
            max = Math.max(max,Math.min(height[start],height[end])*(end-start));
            //increase the start pointer if bar at start is smaller than one at  end
            //else decrease the end
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}
