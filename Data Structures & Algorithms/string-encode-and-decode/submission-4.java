class Solution {

    public String encode(List<String> strs) {
        StringBuffer str = new StringBuffer();
        
        for (String i : strs) {
            int number = i.length();

            str.append(number  + "#" + i);
        }
        return new String(str); 
    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<>();

        // for (int i = 0; i < strs.length; i++) {
        //     strList.add(strs[i]);
        // }
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf("#", i); //(String str, int fromIndex) # và 0 vòng 2 # và 7
            //5#Hello
            //j = 1
            //index i = 0
            int length = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j+1, j+1+length); //substring(2, 7);

            strList.add(word);
            i = j + 1 + length; //7
        }
        return strList;
    }
}