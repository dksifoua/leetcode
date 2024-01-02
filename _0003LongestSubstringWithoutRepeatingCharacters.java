import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0003LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // TODO
        throw new UnsupportedOperationException();
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
