package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class InterviewQuestions {


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

    public static int maxMoves(String word){
        System.out.println(word.chars().filter(c ->c=='N').count());

       int nCount = (((int) word.chars().filter(c -> c == 'N')
                .count()) %2==0) ? ((int) word.chars().filter(c -> c == 'N')
               .count()) /2 : 0 ;
       int aCount = ((int) word.chars().filter(c -> c == 'A')
               .count()) %3==0 ? ((int) word.chars().filter(c -> c == 'A')
               .count()) /3 : 0 ;
       int bCount = (int) word.chars().filter(c -> c == 'B')
               .count();

       if(aCount==bCount && bCount==nCount){
           return aCount;
       }
       else{
           return 0;
       }

    }

    public static void main(String[] args) {
        int count = maxMoves("QABAAAWOBL");
        System.out.println("Count of N " + count);
    }
}
