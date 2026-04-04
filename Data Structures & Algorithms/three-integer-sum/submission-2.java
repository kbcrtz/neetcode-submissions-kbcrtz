class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int l = i + 1; 
            int r = nums.length - 1;
            while(l < r){
                int val = nums[i] + nums[l] + nums[r];
                if(val < 0){
                    l++;
                }else if(val > 0){
                    r--;
                }else{
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r]));
                    ret.add(list);
                    l++;
                    while(nums[l] == nums[l-1] && l<r){
                        l++;
                    }
                }
            }
        }
        return ret;
    }
}
