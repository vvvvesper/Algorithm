package chapter1;

public class LinearSearch {
    private LinearSearch(){}

    /**
     *
     * @param arr 给定数组
     * @param p   目标元素
     * @param <E> 泛型
     * @return  返回目标元素所在的索引，目标元素如果不存在返回-1
     */
    public static <E> int search(E[] arr,E p){
        for(int i =0;i<arr.length;i++){
            if(arr[i].equals(p)){
                return i;
            }
        }
        return -1;
    }
}
