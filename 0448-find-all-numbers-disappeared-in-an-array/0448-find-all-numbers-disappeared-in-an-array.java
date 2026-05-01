class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            findDisappearedNumbers(null);
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null) return null;
        int n = nums.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[nums[i] - 1]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}