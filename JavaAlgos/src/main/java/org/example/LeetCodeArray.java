package org.example;

import java.util.*;

public class LeetCodeArray {
    public static void main(String[] args) {
        int[] numArray = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //Max Area of water
      //  int area = maxArea(numArray);
       // System.out.printf("Maximum area of container is " + area);

        //LeetCode 3 sum Problem
        //Problem statement : Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> threeSumList = new ArrayList<>();
        //Calculate two sum first and then fix the initial Pointer
        threeSumList = threeSum(nums);
      threeSumList.stream().forEach((integers)-> System.out.println("Three sum is" +integers ));

    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //System.out.println("Print something" + nums[0]);
        int i = 0;

        List<List<Integer>> allSums = new ArrayList<>();


        int k = 1;


        int j = nums.length-1;
        while(i<nums.length-2){
             j = nums.length-1;

            //To ensure no-duplication
            if( i>0 && nums[i]==nums[i-1] ){
                i++;
                continue;
            }
            int initialSum = nums[i];


            k = i+1;


            while(k<j) {


                List<Integer> sumList = new ArrayList<>();

                if ( nums[k] + nums[j]+ initialSum > 0 ) {
                    j--;
                    continue;
                }

                if (nums[k] + nums[j]+ initialSum < 0  ) {
                    k++;
                    continue;
                }
                if (nums[k] + nums[j]+ initialSum ==0 ) {
                    sumList.add(nums[i]);
                    sumList.add(nums[j]);
                    sumList.add(nums[k]);
                    allSums.add(sumList);


                    //Ignoring duplicating elements here

                    while( k<j && nums[k]==nums[k+1]){
                        k++;


                    }
                    while( k<j && nums[j]==nums[j-1]){
                        j--;

                    }
                   j--;
                   k++;
                }

            }
            i++;

        }

        return allSums ;
    }

    public static int maxArea(int[] height) {

        //To calculate maxArea , we take 2 pointers and check if length is higher as width would always be lesser as we iterate .
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;
        while (start<end){

            if(height[start]>height[end] ){
                if((height[end]*(end-start))>maxArea) {
                    maxArea = height[end] * (end - start);
                }
                    end--;

                }


            if(height[start]<=height[end] ){
                if((height[start]*(end-start))>maxArea) {
                    maxArea = height[start] * (end - start);
                }
                start++;

                }


            }



        return maxArea;


    }
}


