package com.example.shortkatalgs.easy;

import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class ArrayTasksJava {

    public void rotate(Integer[] nums, int k) {

        System.out.println(Arrays.stream(nums).toList());

        int[] temp = new int[k];
        int length = nums.length;

        for (int i = length - k; i < length; i++)
            temp[i - (length - k)] = nums[i];

        for (int i = length - 1; i >= k; i--)
            nums[i] = nums[i - k];

        for (int i = 0; i < k; i++)
            nums[i] = temp[i];

        System.out.println(Arrays.stream(nums).toList() + " " + k);
    }


}
