package com.example.leetcodestudy.algorithm;

public class TwoSum {

    public static void main(String[] args){
        int[] nums={1,4,2,6,8};
        int[] index=twoSum(nums,6);
        System.out.println(index[0]);
        System.out.println(index[1]);


    }

    public static int[] twoSum(int[] nums, int target) {

        int[] targetIndex=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    targetIndex[0]=i;
                    targetIndex[1]=j;
                }
            }


        }
        return targetIndex;

    }

}
