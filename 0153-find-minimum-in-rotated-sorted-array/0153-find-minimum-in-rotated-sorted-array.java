class Solution {
    public int pivot(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = nums.length-1;
        int index = -1;
        while(s<=e){
            int mid = s+((e-s)/2);
            if(nums[mid]>nums[n-1]){
                index = mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return index;
    }
    
    public int findMin(int[] nums) {
        int result = pivot(nums);
        if(result<0){
            return nums[0];
        }
        return nums[result+1];
    }
}