package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class LeetCodeArray2 {
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};
        int target = 6;
        //2Sum problem

      /*  int[] ints = twoSum(nums, target);
        System.out.println("The array is " + ints[0] + " "+ ints[1]);

       */

        //Median Problem
        /*
        int[] nums2 = {1};
        double median = findMedianSortedArrays( nums, nums2);
        System.out.println("Median is " + median);

         */

        //Remove Duplicates Sorted Array
        int i = removeDuplicates(nums);
        System.out.println("Number of unique elements are " + i);


    }

    static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> countMap = new TreeMap<>();


        for(int i = 0;i<nums.length;i++){
            if(countMap.get(nums[i])==null)
                countMap.put(nums[i],0);
            else{
                int counter = countMap.get(nums[i]);
                counter ++;
                countMap.put(nums[i],counter);


            }

        }

        System.out.println("Array " + nums);
        int i = 0;
        while(i<countMap.keySet().size()) {
            for (Integer key : countMap.keySet()) {
                nums[i] = key;
                i++;
            }
        }
        System.out.println(" " + nums);
        return countMap.keySet().size();
    }

    private static double findMedianSortedArrays(int[] nums, int[] nums2) {

      int length1 = nums.length;
      int length2 = nums2.length;
      int i= 0;
      int j = 0;
      int k = 0;
      int sizeMedian = length1 + length2 ;
      int[] medianArray = new int[length1+ length2];

      //Merge the arrays normally, if arrays are unsorted
        /*
       while(i <length1 ) {
           medianArray[k] = nums[i];
           k++;
           i++;
       }
        while(j <length2) {
            medianArray[k] = nums2[j];
            k++;
            j++;
        }

         */

        while(i<length1 && j<length2){
            if(  nums[i]<nums2[j]) {
                medianArray[k] = nums[i];
                i++;
                k++;
            }
            else if(nums[i]>=nums2[j]) {
                medianArray[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<length1 && k<sizeMedian){
            medianArray[k]= nums[i];
            i++;
            k++;
        }
        while(j<length2 && k<sizeMedian){
            medianArray[k]= nums2[j];
            j++;
            k++;
        }

       // Arrays.sort(medianArray);
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
