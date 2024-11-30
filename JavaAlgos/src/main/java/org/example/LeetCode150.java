package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode150 {

    public static void main(String[] args) {
      //  merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6},3);

        //LeetCode 523. Continuous SubArray Sum
        checkSubarraySum(new int[]{23, 2, 4, 6, 6},7);

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





