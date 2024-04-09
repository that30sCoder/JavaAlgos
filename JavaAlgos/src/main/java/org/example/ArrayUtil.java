package org.example;

import java.util.LinkedList;

public class ArrayUtil {
    public static void main(String[] args) {
        int[]numArray = {0,1,0,4,12};
        int[] naturalNumbers = {2,4,1,8,6,3,7};
        String pallindromeCheck = "madam";
        boolean isPallindrome = checkPallindrome(pallindromeCheck);
       // numArray = reverseArray(numArray, 0, numArray.length);
        for(int number:numArray){
     //       System.out.printf(" "+number);
        }
        
      //  int minimum = minArray(numArray);
   //     int secondMax = secondMax(numArray);
       // System.out.printf("Second Maximum is " + secondMax);
      //  numArray = moveZeros(numArray);
        int missing =findMissing(naturalNumbers);
        System.out.printf("Missing Number is " + missing);

       /* for(int num:numArray){
            System.out.printf(" " + num);
        }

        */


    }

    private static boolean checkPallindrome(String pallindromeCheck) {
        char[] chars = pallindromeCheck.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start<end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static int findMissing(int[] naturalNumbers) {
        int difference = 0;
        int sum = ((naturalNumbers.length+1) * (naturalNumbers.length+2))/2;
        for(int i = 0;i<naturalNumbers.length;i++){
            difference += naturalNumbers[i];
        }
        return sum- difference;
    }

    private static int[] moveZeros(int[] numArray) {
        int j = 0;
       for(int i = 0;i<numArray.length;i++){
           if(numArray[i]!=0 && numArray[j]==0){
               int temp = numArray[j];
               numArray[j]= numArray[i];
               numArray[i]= temp;
           }
           if(numArray[j]!=0){
               j++;
           }
       }
        return numArray;
    }


    private static int secondMax(int[] numArray) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int number:numArray){
            if(number>max){
                secondMax = max;
                max = number;
            }
           else if(number>secondMax && number!=max)
                secondMax = number;


        }
        return secondMax;
    }

    private static int minArray(int[] numArray) {
        int prevNumber = numArray[0];
        for(int number:numArray){
            if(number<prevNumber)
                prevNumber = number;
        }
        return prevNumber;
    }

    static int[] reverseArray(int[] numbers, int start, int end){
        while(start<end){
            int swapNumber = numbers[start];
            numbers[start] = numbers[end-1];
            numbers[end-1]=swapNumber;
            start++;
            end--;
        }
        return numbers;
    }
}