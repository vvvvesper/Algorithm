package chapter9;

public class Solution {
    public static  int search(int[] arr,int target){
        int l=0 , r=arr.length-1;
        //在 arr[l,r] 的范围中寻找target
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                l = mid +1;
            }else{
                r = mid -1;
            }
        }
        return -1;
    }
}
