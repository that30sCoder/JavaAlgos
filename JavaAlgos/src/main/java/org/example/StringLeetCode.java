package org.example;

public class StringLeetCode {
    public static void main(String[] args) {
        //LeetCode 5.
       String longestPallindrome =  longestPalindrome("abba");
    }


        public static String longestPalindrome(String s) {
            int maxLen = 0;
            String max = "";
            for(int i =0;i<s.length();i++){
                //Check for odd length String
                int k = i;
                int j =i;
                while(k>=0 && j<s.length() && s.charAt(k)==s.charAt(j)){
                    if(j-k+1 > maxLen){
                        max = s.substring(k,j+1);
                        maxLen = Math.max(maxLen,(j-k+1));
                    }
                    k--;
                    j++;

                }
                k = i;
                j =i+1;
                while(k>=0 && j<s.length() && s.charAt(k)==s.charAt(j)){
                    if(j-k+1 > maxLen){
                        max = s.substring(k,j+1);
                        maxLen = Math.max(maxLen,(j-k+1));
                    }
                    k--;
                    j++;

                }
            }
            return max;
        }
    }


