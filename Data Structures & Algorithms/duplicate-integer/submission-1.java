class Solution {
    public boolean hasDuplicate(int[] nums) {
        //use a set to get rid of dupes
        //check set.size == nums.length
        //if yes that means no dupes
        //if set != is dupes
        Set<Integer> mySet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            mySet.add(nums[i]);
        }
        if(mySet.size() == nums.length){
            return false;
        }else{
            return true;
        }
    }
}