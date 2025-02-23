# Assignment_Btech2026_-2201920100175-
DATA STRUCTURE AND ALGORITHM
### Problem Statement:
Given a string str of lowercase alphabets and a number k, the task is to print the minimum value of the string after removal of k characters.
The value of a string is defined as the sum of squares of the count of each distinct character present in the string.
Return the minimum possible required value.

Examples:
Input: str = "abcec", k = 1
Output: 6

Input: str = "aabcbcbcabcc", k = 3
Output: 27

Expected Time Complexity: O(n + k log(p))
Note: Here, n is the length of the string, and p is the number of distinct alphabets, while k is the number of alphabets to be removed.

### Solution
```
import java.util.*;

public class MinStringValue {
    public static int minStringValue(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);

        List<Integer> counts = new ArrayList<>(freq.values());
        counts.sort(Collections.reverseOrder());

        int i = 0;
        while (k > 0) {
            if (counts.get(i) > 0) {
                counts.set(i, counts.get(i) - 1);
                k--;
            }
            if (i < counts.size() - 1 && counts.get(i) < counts.get(i + 1)) i++;
            else i = 0;
        }

        int result = 0;
        for (int count : counts) result += count * count;
        return result;
    }

    public static void main(String[] args) {
        String s = "aabcbcbcabcc";
        int k = 3;
        System.out.println(minStringValue(s, k));
    }
}
```
