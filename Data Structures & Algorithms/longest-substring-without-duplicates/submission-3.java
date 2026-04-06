class Solution {
    public int lengthOfLongestSubstring(String s) {
        //ptr l and r
        //iterate r if set does not contain r
        //once set contains r , remove it from set
        //while l!=r {l++}
        //l++ again
        //max = max(r-l, max)
        if(s.isEmpty()){
            return 0;
        }
        Set<Character> mySet = new HashSet<>();
        int l = 0;
        int r = 1;
        int max = 1;
        mySet.add(s.charAt(l));
        while(r <= s.length() - 1){
            if(mySet.contains(s.charAt(r))){
                mySet.remove(s.charAt(r));
                while(s.charAt(l) != s.charAt(r)){
                    mySet.remove(s.charAt(l));
                    l++;
                }
                l++;
            }
            max = Math.max((r-l) + 1, max);
            mySet.add(s.charAt(r));
            r++;
        }
        return max;
    }
}
