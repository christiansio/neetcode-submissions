class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> anagrams = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++){

            char[] currentStr = strs[i].toCharArray();
            Arrays.sort(currentStr);
            String sortedStr = new String(currentStr);

            if (!anagrams.containsKey(sortedStr)){
                anagrams.put(sortedStr, new ArrayList<>());
                anagrams.get(sortedStr).add(strs[i]);
                continue;
            } 

            if (anagrams.containsKey(sortedStr)){
                anagrams.get(sortedStr).add(strs[i]);
                continue;
            }

        }
        result = new ArrayList<>(anagrams.values());
        return result;
        
    }
}
