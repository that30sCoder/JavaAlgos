package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LeetCodeArrayBackTracking {
    public static void main(String[] args) {


        int[] arr = {1,1,2,1};
        //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        boolean returnedValue = containsDuplicate(arr);
        //Remove duplicates from an unSorted Array
        removeDuplicatesUnsorted(arr);
    }

    private static void removeDuplicatesUnsorted(int[] arr) {
      int[] temp = new int[arr.length];
      int j = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]) {
                temp[j] = arr[i];
                j++;
            }

        }

        Set<Integer> linkedSet = new LinkedHashSet<>();
        for(int i = 0;i<arr.length-1;i++){
            linkedSet.add(arr[i]);
        }
        System.out.println("" + temp + linkedSet);


    }

    public static boolean containsDuplicate(int[] nums) {
                //LeetCode 217

        Set<Integer> duplicateSet = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(duplicateSet.contains(nums[i]))
                return true;
            else{
                duplicateSet.add(nums[i]);
            }

        }
        return false;
    }

}
