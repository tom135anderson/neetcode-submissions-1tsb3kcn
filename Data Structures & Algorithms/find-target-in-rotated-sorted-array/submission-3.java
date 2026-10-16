class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        int index = -1;

        while (l <= r) {
            if (target == nums[l]) {
                return l;
            } else if (target == nums[r]) {
                return r;
            }
            int mid = l + (r - l) / 2;

            System.out.println("mid=" + mid);
            if (nums[mid] == target) {
                return mid;
            }
            // checking if the left is sorted
            if (nums[l] <= nums[mid]) {
                // target between l and mid
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;

                } else {
                    r = mid - 1;
                }
            } else {
                if (nums[r] < target || nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
