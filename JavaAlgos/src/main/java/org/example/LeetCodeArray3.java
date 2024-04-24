package org.example;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeArray3 {
    public static void main(String[] args) {

        int[] nums = {0,1};
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
        for(int i = 0;i<nums.length;i++) {
            List<Integer> arrays = new ArrayList<>();
            arrays.add(nums[i]);
            int j = i + 1;
            while (j < nums.length - 1) {
                arrays.add(nums[j]);
                int k = nums.length - 1;
                while (k != j && k > i) {
                    arrays.add(nums[k]);
                    k--;
                }
                j++;
            }
        }

        return permutationArray;
    }

}
