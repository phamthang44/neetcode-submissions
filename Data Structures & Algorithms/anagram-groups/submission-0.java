class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) return List.of(List.of(strs));
        //[act, cat, hat, pots, stop, tops]
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            //ý tưởng là normalize mỗi chuỗi thành một canonical form để các anagram có cùng key
            //và như vậy thì những đảo chữ tuy khác vị trí chữ nhưng sẽ ra 1 giá trị duy nhất
            //cần 1 hàm hay gì đó để biến những chữ trong mảng thành giá trị số
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> groups = new ArrayList<>();
            if (!hashMap.containsKey(key)) {
                groups.add(strs[i]);
                hashMap.put(key, groups);
            } else {
                hashMap.get(key).add(strs[i]);
            }
            
            
        }
        List<List<String>> results = new ArrayList<>();
        for (List<String> i : hashMap.values()) {
            results.add(i);
        }

        return results;
    }
}
