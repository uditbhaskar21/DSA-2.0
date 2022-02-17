package binarySearch;

public class mountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,11,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                ans = i;
                max = arr[i];
            }
        }
        return ans;
    }
}
