//easy
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList();
        
        for(int i=0;i<nums.length;i++){
            //save the starting position           
            int start = i;
            //check until where the pattern goes          
            while(i+1<nums.length && nums[i]+1 == nums[i+1])i++;
            //append to list as asked         
            if(start==i){
                output.add(""+nums[start]);
            }else{
                output.add(""+nums[start]+"->"+nums[i]);
            }
        }
        return output;
    }
}
