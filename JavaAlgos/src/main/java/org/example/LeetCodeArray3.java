package org.example;

public class LeetCodeArray3 {
    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        int val = 2;
        //Remove all occurences of val and return size of modified array
       int result =  removeElement(nums,val);
        System.out.println("Size of modified array is "+ result);

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
}
