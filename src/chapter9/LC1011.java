package chapter9;

import java.util.Arrays;

public class LC1011 {
    public int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum();
        while(l < r){
            int mid = l + (r - l)/2;
            if(days(weights,mid) <= days){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    private int days(int[] weights,int w){
        int sum = 0;
        int count = 0;
        for(int i=0;i<weights.length;i++){
            if((sum+weights[i])<=w){
                sum += weights[i];
            }else{
                count++;
                sum = weights[i];
            }
        }
        count++;
        return count;
    }

    // private int days(int[] weights, int k){

    //     int cur = 0, res = 0;
    //     for(int weight: weights)
    //         if(cur + weight <= k) cur += weight;
    //         else{
    //             res ++;
    //             cur = weight;
    //         }
    //     res ++;
    //     return res;
    // }
}
