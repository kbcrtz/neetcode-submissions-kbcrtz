class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            mySet.add(nums[i]);
        }
        if(nums.length == mySet.size()){
            return false;
        }
        return true;
    }
}