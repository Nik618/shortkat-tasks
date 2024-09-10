package com.example.shortkatalgs.easy;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ArrayTasksJava {

    public void removeDuplicates(Integer[] nums) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                arrayList.add(nums[i]);
                break;
            }
            if (!nums[i].equals(nums[i + 1])) {
                arrayList.add(nums[i]);
            }

        }
        int k = arrayList.size();
        nums = arrayList.toArray(new Integer[0]);

        System.out.println(Arrays.stream(nums).toList() + " " + k);
    }

    public void intersection(Integer[] nums1, Integer[] nums2) {

        // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
        // O(n^2)

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (Objects.equals(nums1[i], nums2[j])) {
                    nums2[j] = null;
                    arrayList.add(nums1[i]);
                }
            }
        }

        System.out.println(arrayList);
    }

}
