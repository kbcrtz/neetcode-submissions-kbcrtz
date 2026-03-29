class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create map
        HashMap<String,List<String>> myMap = new HashMap<>();
        List<List<String>> ret = new ArrayList<>();
        //loop through and check if sorted version is in map
        for(int i = 0; i < strs.length; i++){
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String(sorted);
        //if yes, add to value list
            if(myMap.containsKey(sortedString)){
                myMap.get(sortedString).add(strs[i]);
        //if no, create key and store value list
            }else{
                myMap.put(sortedString, new ArrayList<String>(Arrays.asList(strs[i])));
            }
        }
        //loop through map and add to return list
        for(Map.Entry<String,List<String>> entry: myMap.entrySet()){
            ret.add(entry.getValue());
        }
        return ret;
    }
}
