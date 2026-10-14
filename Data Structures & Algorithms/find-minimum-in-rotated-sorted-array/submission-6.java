class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = nums[0];

        while(l<=r){

            if(nums[l] < nums[r]){
                min = Math.min(min, nums[l]);
    
            }
            
            int mid = l + (r -l)/2;
            min = Math.min(min, nums[mid]);

            if(nums[l] <= nums[mid]){
                //left is sorted
                l = mid + 1;
            }else{
                //right is sorted
                r = mid-1;

            }

        }
        return min;
        
    }
}
