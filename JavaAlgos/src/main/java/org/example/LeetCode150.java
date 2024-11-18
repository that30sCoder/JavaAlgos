package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class LeetCode150 {

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0},3, new int[]{2, 5, 6},3);
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





