class Solution {
    public int findMin(int[] nums) {
        //first first the mid and for sure one side will be sorted
        int low = 0;
        int high = nums.length-1;
        int min = 1000;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low]<=nums[mid]){  
                min=Math.min(min, nums[low]);
                low=mid+1;
            }else{
                min=Math.min(min, nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}
