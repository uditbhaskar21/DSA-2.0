package binarySearch;

public class findInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        int answer = search(arr, target);
        System.out.println(answer);
    }
    public static int search(int[] arr, int target){
        int peak = findPeak(arr);
        int firstTry = bs(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }else{
        return bsreverse(arr,target,peak+1,arr.length-1);
        }
    }
    public static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return arr[start];
    }
    public static int bs(int[] arr, int target, int start, int end){
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                ans = mid;
                return mid;
            }
        }
        return ans;
    }
    public static int bsreverse(int[] arr, int target, int start, int end){
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                end = mid-1;
            }else if(target<arr[mid]){
                start = mid+1;
            }else{
                ans = mid;
                return mid;
            }
        }
        return ans;
    }
}
