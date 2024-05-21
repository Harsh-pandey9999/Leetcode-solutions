class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    generateSubsets(nums, 0, new ArrayList<>(), subsets);
    return subsets;
  }

  private void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
    if (index == nums.length) {
      subsets.add(new ArrayList<>(currentSubset)); // Add a copy to avoid modification
      return;
    }

    // Include current element in the subset
    currentSubset.add(nums[index]);
    generateSubsets(nums, index + 1, currentSubset, subsets);

    // Exclude current element from the subset (backtracking)
    currentSubset.remove(currentSubset.size() - 1);
    generateSubsets(nums, index + 1, currentSubset, subsets);
  }
}
