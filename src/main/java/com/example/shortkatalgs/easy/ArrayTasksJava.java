package com.example.shortkatalgs.easy;

import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class ArrayTasksJava {

    public void rotate(Integer[] nums, int k) {

        System.out.println(Arrays.stream(nums).toList());

        int length = nums.length;

        int temp = 0;
        for (int i = length - 1; i >= k; i--) {
            temp =
            nums[-i + length] = nums[-i + k];
            nums[i] = nums[i - k];
        }

        System.out.println(Arrays.stream(nums).toList() + " " + k);
    }


}
