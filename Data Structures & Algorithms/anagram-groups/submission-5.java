class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> anagrams = new HashMap<>();
        List<List<String>> result;

        for (int i = 0; i < strs.length; i++){

            char[] currentStr = strs[i].toCharArray();
            Arrays.sort(currentStr);
            String sortedStr = new String(currentStr);

            anagrams.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(strs[i]);

        }
        result = new ArrayList<>(anagrams.values());
        return result;
        
    }
}
