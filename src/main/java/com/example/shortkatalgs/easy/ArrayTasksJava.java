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

    public void containsDuplicates(Integer[] nums) {

        // https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
        // сложность O(n)
        // можно сначала отсортировать, а потом искать так же, как в первой задаче, но тогда сложность увеличится
        // long[] array = new long[10000000000]; - так тоже не получилось (индекс огромного массива = элементу исходного, внутри счётчик, сложность была бы О(n))

        boolean flag = false;
        Set<Integer> set = new HashSet<>();

        for (Integer num : nums) {
            if (set.contains(num)) {
                flag = true;
                break;
            } else set.add(num);
        }

        System.out.println(flag);
    }

}
