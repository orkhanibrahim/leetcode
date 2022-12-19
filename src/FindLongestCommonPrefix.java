/*
*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/

public class FindLongestCommonPrefix {
    public static void main(String[] args) {
        String [] str = {"flower","flight","flow","orxan"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strings) {
        if(strings.length==0){
            return "";
        }
        String prefix = strings[0];
        for(int i = 1; i< strings.length; i++) {
            while(strings[i].indexOf(prefix) != 0) {
                prefix=prefix.substring(0,prefix.length()-1);
            }
         //   System.out.println(prefix);
        }
        return prefix;
    }
}
