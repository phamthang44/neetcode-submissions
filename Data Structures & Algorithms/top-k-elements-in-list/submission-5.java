class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> results =  new HashMap<>();
        int[] arrayint = new int[k];
        for (int i = 0; i < nums.length; i ++) {
            if (!results.containsKey(nums[i])) {
                results.put(nums[i], 0);
            } else {
                results.put(nums[i], results.get(nums[i]) + 1);
            }
            
        }

        //1, [1]
        //2, [2, 2]
        //3, [3,3,3]
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(results.entrySet());

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // for (Map.Entry<Integer, Integer> entry : results.entrySet()) {
        //     // System.out.println(entry.getKey() + " = " + entry.getValue());
            
        // }
        for (int i = 0; i < k; i++) {
            arrayint[i] = list.get(i).getKey();
        }
        return arrayint;
    }
}
