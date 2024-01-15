class _0009PalindromeNumber {
    
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reversedX = 0, savedX = x;
        while (x != 0) {
            reversedX = reversedX * 10 + x % 10;
            x /= 10;
        }

        return savedX == reversedX;
    }
}
