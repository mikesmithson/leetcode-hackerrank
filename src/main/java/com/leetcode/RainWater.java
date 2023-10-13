package com.leetcode;

public class RainWater {
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        while (left < right) {
            if (height[left] > leftMax) leftMax = height[left];
            if (height[right] > rightMax) rightMax = height[right];
            if (leftMax < rightMax) {
                ans += Math.abs(leftMax - height[left]);
                left++;
            } else {
                ans += Math.abs(rightMax - height[right]);
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        RainWater water = new RainWater();
        int trapped = water.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println("trapped " + trapped + " units of rain water");
    }
}
