class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l =0;
        int r = numbers.length -1;
        int numi =0;
        int numj=0;
        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                numi = l + 1;
                numj = r + 1;
                break;
            }else if(sum > target){
                r--;
            }else{
                l++;
            }
        
        }

        return new int[]{numi, numj};
        
    }
}
