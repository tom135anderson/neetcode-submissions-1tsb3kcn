class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> op = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
              // System.out.println(i + " " + l + " " + r);
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    op.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                    // skip same numbers
                    while (l < r && nums[l] == nums[l - 1]){
                      l++;
                    }

                }else if(sum < 0){
                    l++;
                }else{r--;}
            }
        }

        return op;
    }
}
