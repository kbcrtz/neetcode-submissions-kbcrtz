class Solution {
    public int[] twoSum(int[] nums, int target) {
        //go through and check if compliment exists in map
        //if yes, return i and index of compliment
        //if no, add nums[i] and i to the map
        //return empty array if no solution exists
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(myMap.containsKey(compliment)){return new int[]{myMap.get(compliment), i};}
            myMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
