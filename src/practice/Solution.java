package practice;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int[]{i,map.get(x)};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.insert(0,"a");
        System.out.println(sb.toString());

        String s = "123";
        System.out.println(Integer.parseInt(s));
        System.out.println(Integer.valueOf(s));
    }

}
