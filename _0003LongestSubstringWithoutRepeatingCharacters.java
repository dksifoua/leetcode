import java.util.*;

public class _0003LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstringOptimal(String s) {
        int maxLength = 0, left = 0, right = 0;
        Set<Character> memory = new HashSet<>();
        while(right < s.length()) {
            char startCharacter = s.charAt(left);
            char endCharacter = s.charAt(right);
            if(memory.contains(endCharacter)) {
                maxLength = Integer.max(maxLength, right - left);
                // System.out.println(left + " " + right + " " + s.substring(left, right + 1) + " " + maxLength);
                memory.remove(startCharacter);
                left += 1;
                continue;
            }

            memory.add(endCharacter);
            right += 1;
        }

        return Integer.max(maxLength, right - left);
    }

    public int lengthOfLongestSubstringFastest(String s) {
        int maxLength = 0, left = 0, right = 0;
        char currentCharacter;
        int indexOfFirstOccurrenceOfCurrentCharacter;
        while(right < s.length()) {
            currentCharacter = s.charAt(right);
            indexOfFirstOccurrenceOfCurrentCharacter = s.indexOf(currentCharacter, left);
            if(indexOfFirstOccurrenceOfCurrentCharacter >= left && indexOfFirstOccurrenceOfCurrentCharacter < right) {
                // System.out.println(left + " " + right + " " + s.substring(left, right + 1) + " " + maxLength);
                left = indexOfFirstOccurrenceOfCurrentCharacter + 1;
            }
            maxLength = Integer.max(maxLength, right - left + 1);
            right += 1;
        }

        return maxLength;
    }

    public int lengthOfLongestSubstringBruteForce(String s) {
        if(s.length() == 0) return 0;

        int maxLength = 1;
        for(int i = 0; i < s.length(); i++) {
            char start = s.charAt(i);

            Set<Character> memory = new HashSet<>(List.of(start));
            boolean foundDuplicate = false;
            for(int j = i; j < s.length(); j++) {
                if(i == j) continue;
                char end = s.charAt(j);
                if(memory.contains(end)) {
                    foundDuplicate = true;
                    maxLength = Integer.max(maxLength, j - i);
                    break;
                }
                memory.add(end);
            }
            if(!foundDuplicate) {
                maxLength = Integer.max(maxLength, s.length() - i);
            }

        }
        return maxLength;
    }
}
