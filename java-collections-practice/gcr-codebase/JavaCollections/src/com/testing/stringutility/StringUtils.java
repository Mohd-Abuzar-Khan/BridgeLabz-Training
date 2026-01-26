package com.testing.stringutility;

public class StringUtils {
    public String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
    
    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = reverse(cleaned);
        return cleaned.equals(reversed);
    }
    
    public String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
}
