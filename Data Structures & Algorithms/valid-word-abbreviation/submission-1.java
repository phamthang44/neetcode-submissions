class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
    StringBuilder expanded = new StringBuilder();

    for (int i = 0; i < abbr.length(); i++) {

        if (Character.isDigit(abbr.charAt(i))) {

            if (abbr.charAt(i) == '0') {
                return false;
            }

            int num = 0;

            while (i < abbr.length() &&
                   Character.isDigit(abbr.charAt(i))) {

                num = num * 10 + (abbr.charAt(i) - '0');
                i++;
            }

            i--;

            for (int k = 0; k < num; k++) {
                expanded.append('*');
            }

        } else {
            expanded.append(abbr.charAt(i));
        }
    }

    if (expanded.length() != word.length()) {
        return false;
    }

    for (int i = 0; i < word.length(); i++) {

        if (expanded.charAt(i) == '*') {
            continue;
        }

        if (expanded.charAt(i) != word.charAt(i)) {
            return false;
        }
    }

    return true;
}
}