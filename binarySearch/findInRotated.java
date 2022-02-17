package binarySearch;

public class findInRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,7,9,10,1,2};
        int tar = 7;
        int ans = findInsorted(arr, tar);
        System.out.println(ans);
    }
    public static int findInsorted(int[] arr, int tar){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==tar){
                return mid;
            }else if(arr[start]<=arr[mid]){
                //start to mid is sorted
                if(tar >= arr[start] && tar< arr[mid]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }else if(arr[mid]<=arr[end]){
                //mid to end is sorted
                if(tar>arr[mid] && tar<=arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
