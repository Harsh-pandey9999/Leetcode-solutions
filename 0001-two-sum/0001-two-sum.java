class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Hash map to store numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement (target minus current number)
            int complement = target - nums[i];

            // Check if the complement exists in the hash map
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{numMap.get(complement), i};
            }

            // Add the current number and its index to the hash map
            numMap.put(nums[i], i);
        }

        // If no such pair is found, return null
        return null;
    }
}
