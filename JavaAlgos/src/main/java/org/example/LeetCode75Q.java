
package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode75Q {
    public static void main(String[] args) {
    findDifference(new int[]{1, 2, 3,3}, new int[]{1, 1, 2,2});


    }


    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

       Set<Integer> set1 = new HashSet<>();
       Set<Integer> set2 = new HashSet<>();
       List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        List<List<Integer>> li = new ArrayList<>();
       for(int num:nums1){
           set1.add(num);
       }
        for(int num:nums2){
            set2.add(num);
        }

        for(int num:nums2){
            if (!(set1.contains(num) || li1.contains(num))){
                li1.add(num);
            }
        }

        for(int num:nums1){
            if (!(set2.contains(num) || li2.contains(num))){
                li2.add(num);
            }
        }

        li.add(li1);
        li.add(li2);
        return li;
    }


}
