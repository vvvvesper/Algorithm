package chapter9;

public class BinarySearch {
    //非递归实现二分查找
    public static <E extends Comparable<E>> int search(E[] arr,E target){
        int l=0 , r=arr.length-1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(arr[mid].compareTo(target) == 0){
                return mid;
            }
            if(arr[mid].compareTo(target) < 0){
                l = mid +1;
            }else{
                r = mid -1;
            }
        }
        return -1;
    }

    //递归实现二分查找
    public static <E extends Comparable<E>> int searchR(E[] arr,E target){
        return searchR(arr,0,arr.length - 1,target);
    }

    public static <E extends Comparable<E>> int searchR(E[] arr,int l,int r,E target){
        int mid = l + (r-l)/2;
        if(l>r) return -1;
        if(arr[mid].compareTo(target) == 0){
            return mid;
        }
        if(arr[mid].compareTo(target) < 0){
            return searchR(arr,mid+1,r,target);
        }
        return searchR(arr,l,mid-1,target);
    }

    // > target 的最小值索引
    public static <E extends Comparable<E>> int upper(E[] arr,E target){
        // arr[l,r]  r=arr.length
        int l=0,r=arr.length;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(arr[mid].compareTo(target) <= 0){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }


    public static <E extends Comparable<E>> int upperCeil(E[] arr,E target){
        int p = BinarySearch.upper(arr,target);
        if(p-1>= 0 && arr[p-1] == target){
            return p-1;
        }
        return p;
    }

    public static <E extends Comparable<E>> int lowerCeil(E[] arr,E target){
        // arr[l,r]  r=arr.length
        int l=0,r=arr.length;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(arr[mid].compareTo(target) < 0){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }


    // < target 的最大值索引
    public static <E extends Comparable<E>> int lower(E[] arr,E target){
        int l=-1,r=arr.length-1;
        while(l < r){
//            System.out.println(l + " " + r);
            int mid = l + (r - l + 1) / 2;
            if(arr[mid].compareTo(target) >= 0){
                r = mid-1;
            }
            else{
                l = mid;
            }
        }
        return r;
    }

    public static <E extends Comparable<E>> int lowerFloor(E[] arr,E target){
        int p = BinarySearch.lower(arr,target);
        if(p+1<=arr.length-1 && arr[p+1] == target){
            return p+1;
        }
        return p;
    }

    public static <E extends Comparable<E>> int upperFloor(E[] arr,E target){
        int l = -1,r=arr.length-1;
        while(l<r){
            int mid = l + (r-l+1)/2;
            if(arr[mid].compareTo(target)>0){
                r = mid -1;
            }else{
                l = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,1,3,3,5,5};
        for(int i=0;i<=arr.length;i++){
            System.out.print(BinarySearch.upper(arr,i)+" ");;
        }
        System.out.println();

        for(int i=0;i<=arr.length;i++){
            System.out.print(BinarySearch.upperCeil(arr,i)+" ");;
        }
        System.out.println();

        for(int i=0;i<=arr.length;i++){
            System.out.print(BinarySearch.lowerCeil(arr,i)+" ");;
        }
        System.out.println();

        for(int i=0;i<=arr.length;i++){
            System.out.print(BinarySearch.lower(arr,i)+" ");;
        }
        System.out.println();

        for(int i=0;i<=arr.length;i++){
            System.out.print(BinarySearch.lowerFloor(arr,i)+" ");;
        }
        System.out.println();

        for(int i=0;i<=arr.length;i++){
            System.out.print(BinarySearch.upperFloor(arr,i)+" ");;
        }
        System.out.println();
    }
}
