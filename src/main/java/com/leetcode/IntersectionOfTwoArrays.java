package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {
    private Map<Integer, Integer> dictionary;

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }
        List<Integer> result = new ArrayList<>();

        dictionary = buildDictionary(nums1);
        for(int i = 0; i< nums2.length; i++) {
            if(dictionary.containsKey(nums2[i]) && dictionary.get(nums2[i]) != 0) {
                result.add(nums2[i]);
                dictionary.put(nums2[i], dictionary.get(nums2[i]) - 1);
            }
        }

        int[] duplicateArray = new int[result.size()];

        for(int i=0; i< result.size(); i++) {
            duplicateArray[i] = result.get(i);
        }

        return duplicateArray;
    }

    private Map<Integer, Integer> buildDictionary(int[] nums) {
        Map<Integer, Integer> dictionary = new HashMap<>();
        for (int num : nums) {
            Integer count = dictionary.getOrDefault(num, 0);
            dictionary.put(num, ++count);
        }
        return dictionary;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();
        int[] result = intersection.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});

        System.out.println("Got a result");
    }
}
