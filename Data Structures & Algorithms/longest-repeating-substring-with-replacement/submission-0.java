class Solution {
    public int characterReplacement(String s, int k) {
        //window length - most freq <= k
        HashMap<Character, Integer> myMap = new HashMap<>();
        int l = 0;
        int r = 0;
        int ret = 0;
        while(r < s.length()){
            myMap.put(s.charAt(r),myMap.getOrDefault(s.charAt(r), 0) + 1);
            while((r - l + 1) - Collections.max(myMap.values()) > k){
                myMap.put(s.charAt(l), myMap.get(s.charAt(l))-1);
                l++;
            }
            ret = Math.max(ret, r-l + 1);
            r++;
        }
        return ret;
    }
}