class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        java.util.HashSet<Integer> result = new java.util.HashSet<>();

        // Add elements of nums1 to set
        for (int num : nums1) {
            set.add(num);
        }

        // Check elements of nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Convert result set to array
        int[] ans = new int[result.size()];
        int index = 0;

        for (int num : result) {
            ans[index++] = num;
        }

        return ans;
    }
}