import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int i = 0;
        int n = s.length();

        while (i < n) {
            // Get value of current character
            int currentVal = romanMap.get(s.charAt(i));
            
            // Get value of next character if it exists
            int nextVal = (i + 1 < n) ? romanMap.get(s.charAt(i + 1)) : 0;

            // If current value is less than next, subtract it (subtraction case)
            if (currentVal < nextVal) {
                total += nextVal - currentVal;
                i += 2; // Skip next character as it's already processed
            } else {
                // Otherwise, add it
                total += currentVal;
                i++;
            }
        }

        return total;
    }
}   