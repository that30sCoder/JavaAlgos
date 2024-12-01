package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode150 {

    public static void main(String[] args) {
      //  merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6},3);

        //LeetCode 523. Continuous SubArray Sum
      //  checkSubarraySum(new int[]{23, 2, 4, 6, 6},7);

        //LeetCode 525.BinaryArray longest
        int maxLength = findMaxLength(new int[]{0,0,1,0,0,0,1,1});
        System.out.println("Max length"+ maxLength);


    }




    public static int findMaxLength(int[] nums) {

        int max =0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        int diff =0;

        for(int i =0;i<nums.length;i++){

            diff += (nums[i] == 0) ? 1 : -1;



            if(hashMap.containsKey(diff)) {

                max = Math.max(max, i - (hashMap.get(diff)));

            }
            else {
                hashMap.put(diff,  i);
            }
        }

        return max;
    }




    public static  boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum=0 ;
        int remainder ;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
            remainder = sum%k;
            if(remainder<0){
                remainder+=k;
            }
            if(sum%k==0){
                return true;
            }

            if(hashMap.containsKey(remainder) ){
                if(i-hashMap.get(remainder)>1)
                return true;
            }
            else{
                hashMap.put(remainder,i);
            }
        }
        return false;
    }








    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;


        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j])
                nums1[k--]=nums1[i--];
            else
                nums1[k--]=nums2[j--];

        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
        System.out.println("The array is" + nums1);

    }


    }





