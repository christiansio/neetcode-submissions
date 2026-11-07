class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> anagrams = new HashMap<>();
        List<List<String>> result;

        for (String str : strs){

            char[] currentStr = str.toCharArray();
            Arrays.sort(currentStr);
            String sortedStr = new String(currentStr);

            anagrams.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);

        }
        result = new ArrayList<>(anagrams.values());
        return result;
        
    }
}
