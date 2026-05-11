class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        HashMap<Integer, List<Integer>> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            //đếm số nào là phần lớn trong mảng ?
            if (!map.containsKey(nums[i])) {
                map.putIfAbsent(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(nums[i]);
        }
        int tempKey = 0;
        for (Integer i : map.keySet()) {   
            if (map.get(i).size() > count) {
                count = map.get(i).size();
                tempKey = i;
            }
        }
        return tempKey;
    }
}