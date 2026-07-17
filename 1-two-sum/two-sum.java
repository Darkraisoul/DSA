class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i< nums.length;i++){
            int sol = target - nums[i];

            if(numMap.containsKey(sol)){
                return new int []{numMap.get(sol),i};
                }
                
            else{
                numMap.put(nums[i],i);
            }
        }  return new int []{-1,-1};

        
    }
}