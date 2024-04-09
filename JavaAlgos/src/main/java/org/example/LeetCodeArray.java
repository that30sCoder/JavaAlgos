package org.example;

public class LeetCodeArray {
    public static void main(String[] args) {
        int[] numArray = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //Max Area of water
        int area = maxArea(numArray);
        System.out.printf("Maximum area of container is " + area);

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


