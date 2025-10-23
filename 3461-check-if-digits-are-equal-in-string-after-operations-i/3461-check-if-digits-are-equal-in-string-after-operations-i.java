public class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        char[] array = s.toCharArray();
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 0; j <= n - 1 - i; j++) {
                array[j] = (char) (((array[j] - '0' + array[j + 1] - '0') % 10) + '0');
            }
        }
        return array[0] == array[1];
    }
}