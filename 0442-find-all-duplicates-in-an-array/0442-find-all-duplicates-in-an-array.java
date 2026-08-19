class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int a = Math.abs(nums[i]);
            if(nums[a-1]>0){
                nums[a-1] *= -1;
            }
            else{
                arr.add(a);
            }
        }
        return arr;
    }
}