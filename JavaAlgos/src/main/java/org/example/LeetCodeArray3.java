package org.example;

import java.util.*;

public class LeetCodeArray3 {

    public static void main(String[] args) {

        int[] nums = {1,4,7};
        int val = 2;

        //Remove all occurences of val and return size of modified array
      /* int result =  removeElement(nums,val);
        System.out.println("Size of modified array is "+ result);
        
       */

        //Find All Permutations of Array
        List<List<Integer>> permute = permute(nums);
        System.out.println("All array permutations are " + permute);


    }

    public static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length;
        int size = 0;
        int count = 0;


        while(start<end ){
            if(nums[start]==val){
                count ++;

                if(nums[end-1]!=val) {

                    nums[start] = nums[end-1];
                    end--;


                }
                else{
                    end--;
                    continue;
                }




            }
            start++;
            size++;

        }
        System.out.println("The modified array is" + (nums.length - count));
        return (nums.length-count);

    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> permutationArray = new ArrayList<>();
        List<Integer> arrays = new ArrayList<>();
        Set<Integer> results = new HashSet<>();
        //The function should be able to check the element,add uniques and then remove the latest added
        Arrays.sort(nums);
        backTrackAlgo(arrays, nums, permutationArray);
        System.out.println(" The list is" + permutationArray);
        return permutationArray;
    }

        public static void backTrackAlgo (List<Integer> createdArray,int[] nums,List<List<Integer>> permutationList){
            //Check the length of the arraylist
        if(createdArray.size()==nums.length){
               permutationList.add((new ArrayList<>(createdArray)));

           // System.out.println("what we return " + counter);
                return;
           }
           for(int i = 0;i<nums.length;i++){
               if(createdArray.contains(nums[i]))
                    continue;
               else   {
                   createdArray.add(nums[i]);
                   backTrackAlgo(createdArray, nums, permutationList);
                   System.out.println("num" + nums[i]);
                   createdArray.remove(createdArray.size()-1);
               }
           }

        }



    }


