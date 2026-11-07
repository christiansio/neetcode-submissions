class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> passedVals = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int complement = target - nums[i];

            if (passedVals.containsKey(complement)){
                return new int[]{passedVals.get(complement), i};
            }

            passedVals.put(nums[i], i);
        }

        return new int[]{};
    }
}
