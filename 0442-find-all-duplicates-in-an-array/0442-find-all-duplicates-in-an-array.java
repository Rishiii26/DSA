class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int i:freq.keySet()){
            if(freq.get(i)>1){
                result.add(i);
            }
        }
        return result;
    }
}