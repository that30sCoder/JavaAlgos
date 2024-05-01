package org.example;

import java.util.HashMap;
import java.util.Map;

public class InterviewClass {

    public static void main(String[] args) {

        //Problem 1. Function to Check Pallindrome of String wiyhout inbuilt function

        String testString = "level";
        boolean isPallindrome = checkPallindromeString(testString);
        System.out.println("String is pallindrome " + isPallindrome);



        //Problem 2. Recursive function for binary Search
        int[] binarySearchTest = {1,2,3,4,5,6};
        int searchValue = 4;
        int foundOrNot = binarySearchFunction(binarySearchTest,searchValue);
        System.out.println("Index of searchValue " + foundOrNot);




        //Problem 3.Note-Magazine problem
        String note = "deaa";
        String magazine = "abcde";
        Boolean noteCheck = findNoteMagazine(note,magazine);
        System.out.println("Note can be created form magazine is " + noteCheck);



        //Problem 4. roman to integer
        String romanNumeral = "CDXLIV";
        System.out.println(romanConvertFunction(romanNumeral));


    }

    public static int romanConvertFunction(String romanNumeral) {
        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int curValue = rCharToInt(romanNumeral.charAt(i));

            if (curValue < prevValue) { //5-1 =4
                result = result - curValue;
            } else {
                result = result + curValue;
            }

            prevValue = curValue;
        }

        return result;
    }

    public static int rCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    private static boolean findNoteMagazine(String note, String magazine) {
        char[] magazineChars = magazine.toCharArray();
        char[] noteChars = note.toCharArray();
        Map<Character,Integer> countMap = new HashMap<>();
        for(int i = 0;i<magazineChars.length;i++){
            if(countMap.containsKey(magazineChars[i])){
                countMap.put(magazineChars[i],countMap.get(magazineChars[i])+1);
            }
            else
                countMap.put(magazineChars[i],1);
        }
        for(char ch:noteChars){
            if(!countMap.containsKey(ch) || countMap.get(ch)==0){
                return false;
            }
            countMap.put(ch,countMap.get(ch)-1);
        }
        return true;

    }

    private static int binarySearchFunction(int[] binarySearchTest, int searchValue) {
        int i = 0;
        int k = binarySearchTest.length-1;
        int middle = 0;
        while(i <=k){
            middle = i + (k-i)/2;
            if(binarySearchTest[middle]==searchValue){
                return middle;
            }
            else if (binarySearchTest[middle]<searchValue){
                i = middle+1;
            }
            else
                k = middle-1;
        }
        return -1;

    }

    private static Boolean checkPallindromeString(String testString) {
        for(int i = 0;i<testString.length()/2;i++){
            if(testString.charAt(i)!=testString.charAt(testString.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
