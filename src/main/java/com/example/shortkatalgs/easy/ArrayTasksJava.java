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

    public void findSingleNumber(Integer[] nums) {

        // O(n)
        // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
        // идея с тестового собеса)

        int repeatingSum = 0;
        int totalSum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            repeatingSum += nums[i];
            if (set.contains(nums[i])) {
                totalSum += nums[i] * 2;
            } else
                set.add(nums[i]);
        }
        System.out.println(repeatingSum - totalSum);
    }

}
