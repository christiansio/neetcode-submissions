class Solution {
    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;

        int[] answer = new int[2];

        for (int i = 0; i < length; i++){

            for (int j = i + 1; j < length; j++){

                int sum;
                sum = nums[i] + nums[j];

                if (sum == target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }

        

        return answer;
    }
}
