class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        if(size <=0)
            throw new IllegalArgumentException("No two sum solution");
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i < size; i++) {
          map.put(nums[i], i);
        }
        for(int i=0; i < size; i++) {
            int compliment = target - nums[i] ;
            if(map.containsKey(compliment)  && map.get(compliment) != i) {
                return new int[]{i, map.get(compliment)} ;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
