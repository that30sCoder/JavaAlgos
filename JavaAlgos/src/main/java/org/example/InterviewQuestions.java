package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestions {


    public static int maxMoves(String word) {
        /*A string S made of uppercase English letters is given.
     In one move, six letters forming the word "BANANA" (one 'B', three 'A's and two 'N's) can be deleted from S.
      What is the maximum number times such a move can be applied to S?
       Write a function: function solution(S); that, given a string S of length N,
        returns the maximum number of moves that can be applied.
         Examples: 1. Given S = "ΝΑΑΒΧΧΑΝ", the function should return 1. ΝΑΑΒΧΧΑΝ →XX 2.
          Given S = "ΝΑΑΝΑΑΧΝΑBABYNNBZ", the function should return 2. ΝΑΑΝΑΑΧΝΑΒΑΒΥNNBZ ΝΑΑΧΝΑBYNBZ 3.
           Given S = "QABAAAWOBL", the function should return 0. QABAAAWOBL
            Write an efficient algorithm for the following assumptions: N is an integer within the range [1..100,000];
             string S is made only of uppercase letters (A-Z). XBYNZ*/
        System.out.println(word.chars().filter(c -> c == 'N').count());

        int nCount = (((int) word.chars().filter(c -> c == 'N')
                .count()) % 2 == 0) ? ((int) word.chars().filter(c -> c == 'N')
                .count()) / 2 : 0;
        int aCount = ((int) word.chars().filter(c -> c == 'A')
                .count()) % 3 == 0 ? ((int) word.chars().filter(c -> c == 'A')
                .count()) / 3 : 0;
        int bCount = (int) word.chars().filter(c -> c == 'B')
                .count();

        if (aCount == bCount && bCount == nCount) {
            return aCount;
        } else {
            return 0;
        }

    }


    public static int maxPermutations(int[] array) {
        /*You are given N numbers on a circle described by array A. Find the maximum number of neighboring pairs whose sums are even. One element can belong to only one pair
Write a function:
class Solution ( pub side int solution(ant|1 A);
that, given an array A consisting of N integers, returns the maximum number of neighboring pairs whose sums are even.
*/
        Set<Integer> dupSet = new HashSet<>();
        int counter = 0;
        for(int i =0;i<array.length-1;i++){


           if(!dupSet.contains(i) && !dupSet.contains(i+1) &&
            (array[i] + array[i+1])%2==0 ){

               counter ++;
               dupSet.add(i);
               dupSet.add(i+1);
           }

           if(!dupSet.contains(0) && !dupSet.contains(array.length-1)){
               counter ++;
               dupSet.add(0);
               dupSet.add(array.length-1);
           }






        }
        return counter;
    }

    public static int minimumDeletions(String s) {

        /*
        * You are given a string s consisting only of characters 'a' and 'b'

You can delete any number of characters in s to make s balanced. s is balanced if there is no pair of indices (i,j) such that i < j and s[i] = 'b' and s[j]= 'a'.

Return the minimum number of deletions needed to make s balanced.
        * */

        int minDeletions = 0;
        int minDeletions1 = 0;
        for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='b'){
                    minDeletions1++;
                }
                else {

                    minDeletions = Math.min(minDeletions+1,minDeletions1);
                }
        }





        System.out.println("check this" +minDeletions);
        return 0;
    }

    public static void main(String[] args) {
       /*Maximum moves question
        int count = maxMoves("QABAAAWOBL");
        System.out.println("Count of N " + count);

        */

       /* All permuatations
        int allPermutations = maxPermutations(new int[]{4, 2, 5, 8, 7, 3, 7});
        System.out.println("All permutations " + allPermutations);

        */
        minimumDeletions("ababaaaabbbbbaaababbbbbbaaabbaababbabbbbaabbbbaabbabbabaabbbababaa");

    }
}
