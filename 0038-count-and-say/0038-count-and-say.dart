class Solution {
  String countAndSay(int n) {
  String say(String s) {
    String res = "";
    int i = 0;
    while (i < s.length) {
      int count = 1;
      while (i + 1 < s.length && s[i] == s[i + 1]) {
        count++;
        i++;
      }
      res += "$count${s[i]}";
      i++;
    }
    return res;
  }

  String s = "1";
  for (int i = 1; i < n; i++) {
    s = say(s);
  }
  return s;
}

}