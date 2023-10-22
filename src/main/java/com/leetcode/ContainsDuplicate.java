package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    private Set<Integer> seen = new HashSet<>();
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i <= nums.length; i++) {
            if(seen.contains(nums[i])){
                return true;
            }
            else {
                seen.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));
    }

}
