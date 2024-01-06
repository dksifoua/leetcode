import java.util.*;

public class _0005LongestPalindromicSubstring {

    public static void main(String[] args) {
        String l = longestPalindrome("abb");
        System.out.println("The longest palindrome is: " + l);
    }

    public static String longestPalindrome(String s) {
        String reversedS = new StringBuilder(s).reverse().toString();

        int size = s.length();
        int[][] array2D = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array2D[i][j] = reversedS.charAt(i) == s.charAt(j) ? 1 : 0;
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========");

        StringBuilder palindrome = new StringBuilder();
        Map<Integer, List<String>> palindromes = new HashMap<>();

        int row = 0;
        while (row < size) {
            int i = row, j = 0;
            while (i < size && j < size) {
                if (array2D[i][j] == 1) palindrome.append(s.charAt(j));
                else addToPalindromesAndClear(palindromes, palindrome);

                i += 1; j += 1;
            }

            if (palindrome.length() > 0) addToPalindromesAndClear(palindromes, palindrome);
            row += 1;
        }

        int col = 1;
        while (col < size) {
            int i = 0, j = col;
            while (i < size && j < size) {
                if (array2D[i][j] == 1) palindrome.append(s.charAt(j));
                else addToPalindromesAndClear(palindromes, palindrome);

                i += 1; j += 1;
            }

            if (palindrome.length() > 0) addToPalindromesAndClear(palindromes, palindrome);
            col += 1;
        }

        int maxLength = 0;
        for (int length: palindromes.keySet()) {
            if (length > maxLength) maxLength = length;
        }

        return palindromes.get(maxLength).get(0);
    }

    private static void addToPalindromesAndClear(Map<Integer, List<String>> palindromes, StringBuilder palindrome) {
        if (!isPalindrome(palindrome.toString())) {
            palindrome.setLength(0);
            return;
        }

        int length = palindrome.length();
        if (!palindromes.containsKey(length)) {
            palindromes.put(length, new ArrayList<>());
        }

        palindromes.get(length).add(palindrome.toString());
        palindrome.setLength(0);
    }

    private static boolean isPalindrome(String palindrome) {
        boolean result = true;

        int left = 0, right = palindrome.length() - 1;
        while (left < right) {
            if (palindrome.charAt(left) == palindrome.charAt(right)) {
                left += 1; right -= 1;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }
}
