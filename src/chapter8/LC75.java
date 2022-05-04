package chapter8;

public class LC75 {
    //单路快排
    // public void sortColors(int[] nums) {
    //     sortColors(nums,0,nums.length-1);
    // }

    // public void sortColors(int[] nums,int l,int r) {
    //     if(l>r) return;
    //     int p = partition(nums,l,r);
    //     sortColors(nums,l,p-1);
    //     sortColors(nums,p+1,r);
    // }

    // public int partition(int[] nums,int l,int r){
    //     nums[l+1,j] <v  nums[j+1,r]>=v
    //     int j=l,i=l+1;
    //     while(i<=r){
    //         if(nums[i]<nums[l]){
    //             j++;
    //             swap(nums,j,i);
    //             i++;
    //         }else{
    //             i++;
    //         }
    //     }
    //     nums[l,j-1] <v  nums[j+1,r]>=v
    //     swap(nums,l,j);
    //     return j;

    // int j = l;
    // for(int i=l+1;i<=r;i++){
    //     if(nums[i]<nums[l]){
    //         j++;
    //         swap(nums,i,j);
    //     }
    // }
    // swap(nums,l,j);
    // return j;
    // }

    //双路快排
    public void sortColors(int[] nums) {
        sortColors(nums, 0, nums.length - 1);
    }

    public void sortColors(int[] nums, int l, int r) {
        if (l >= r) return;
        int p = partition(nums, l, r);
        sortColors(nums, l, p - 1);
        sortColors(nums, p + 1, r);
    }

    public int partition(int[] nums, int l, int r) {

        //nums[l+1,i-1]<=v  nums[j+1,r]>=v
        int i = l + 1, j = r;
        while (true) {
            while (i <= j && nums[i] < nums[l]) {
                i++;
            }
            while (j >= i && nums[j] > nums[l]) {
                j--;
            }
            if (i >= j) break;
            swap(nums, i, j);
            i++;
            j--;
        }
        swap(nums, l, j);
        return j;
    }

    //三路快排
    // public void sortColorsway(int[] nums) {
    //     sortColors(nums,0,nums.length-1);
    // }

    // public void sortColors(int[] nums,int l,int r) {

    //     //nums[l...lt] ==0  nums[lt+1,gt-1]==1  nums[gt,r]==2
    //     int lt = l-1,gt=r+1,i=l;
    //     while(i<gt){
    //         if(nums[i] == 0){
    //             lt++;
    //             swap(nums,i,lt);
    //             i++;
    //         }else if(nums[i] == 1){
    //             i++;
    //         }else{
    //             gt--;
    //             swap(nums,i,gt);
    //         }
    //     }
    // }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
