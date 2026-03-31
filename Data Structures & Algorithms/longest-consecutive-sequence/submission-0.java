class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> mySet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            mySet.add(nums[i]);
        }
        List<Integer> myArr = new ArrayList(mySet);
        Collections.sort(myArr);
        int count = 1;
        int max = 1;
        for(int i = 1; i < myArr.size(); i++){
            if(myArr.get(i) == (myArr.get(i-1) + 1)){
                count++;
            }else{
                count = 1;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
