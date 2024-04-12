package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeArray2 {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 9;
        //2Sum problem

        int[] ints = twoSum(nums, target);
        System.out.println("The array is " + ints[0] + " "+ ints[1]);
    }

    private static int[] twoSum(int[] nums,int target) {
        List<Integer,int[]> keyList
        for(int i = 0;i<nums.length;i++){
            numMap.put(i, new int[]{nums[i], i});
        }


        //Sort the array
        Arrays.sort(nums);

        int[]printArray = new int[2];

        int i = 0;
        int j = nums.length-1;

        while(i<j){
            if(nums[i]+ nums[j]==target) {


                printArray[0] = numMap.get(nums[i])[nums[i]];
                printArray[1] = numMap.get(nums[j])[nums[j]];
                break;
            }
            if(nums[i]+ nums[j]>target) {
                j--;
            }
            if(nums[i]+ nums[j]<target) {
                i++;
            }
        }
        return printArray;
    }
}
