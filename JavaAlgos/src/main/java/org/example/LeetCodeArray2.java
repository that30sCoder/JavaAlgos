package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class LeetCodeArray2 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 6;
        //2Sum problem

      /*  int[] ints = twoSum(nums, target);
        System.out.println("The array is " + ints[0] + " "+ ints[1]);

       */

        //Median Problem
        int[] nums2 = {2};
        double median = findMedianSortedArrays( nums, nums2);
        System.out.println("Median is " + median);
    }

    private static double findMedianSortedArrays(int[] nums, int[] nums2) {

      int length1 = nums.length;
      int length2 = nums2.length;
      int i= 0;
      int j = 0;
      int k = 0;
      int sizeMedian = length1 + length2 ;
      int[] medianArray = new int[length1+ length2];

      //Merge the arrays normally
       while(i <length1) {
           medianArray[k] = nums[i];
           k++;
           i++;
       }
        while(j <length2) {
            medianArray[k] = nums2[j];
            k++;
            j++;
        }

        Arrays.sort(medianArray);
        double median = (sizeMedian%2)==0 ? (double)((medianArray[(sizeMedian-1)/2]
                + medianArray[(sizeMedian/2)]))/2
                : (double) (medianArray[(sizeMedian)/2]);
        return median;
    }

    private static int[] twoSum(int[] nums,int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        Map<Integer,Integer>countMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if (!numMap.containsKey(nums[i]))
            numMap.put(nums[i], i);
            else
                countMap.put(nums[i],i);
        }


        //Sort the array
       // Arrays.sort(nums);

        int[]printArray = new int[2];

        int i = 0;
        int j = nums.length-1;

        while(i<j){
            int complement = 0;
            complement = target -nums[i];
            if(numMap.containsKey(complement)) {
                printArray[0] = numMap.get(nums[i]);
                if(countMap.containsKey(complement))
                printArray[1] = countMap.get(complement);
                else
                    printArray[1] = numMap.get(complement);
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
