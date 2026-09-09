class Solution {
    public int negative(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        int index = -1;

        while(s<=e){
            int mid = s+((e-s)/2);
            if(nums[mid]>=0){
                e=mid-1;
            }
            else{
                index=mid;
                s=mid+1;
            }
        }
        if(index==-1){
            return 0;
        }
        return index+1;
    }
    public int positive(int[] nums){
        int s = 0;
        int e = nums.length - 1;
        int n = nums.length - 1;
        int index = -1;

        while(s<=e){
            int mid = s+((e-s)/2);
            if(nums[mid]<=0){
                s=mid+1;
            }
            else{
                index=mid;
                e=mid-1;
            }
        }
        if(index==-1){
            return 0;
        }
        return n-index+1;
    }
    public int maximumCount(int[] nums) {
        int pos = positive(nums);
        int neg = negative(nums);
        int result =Math.max(pos,neg);
        return result;
    }
}