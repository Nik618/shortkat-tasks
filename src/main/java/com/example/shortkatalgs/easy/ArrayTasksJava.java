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

}
