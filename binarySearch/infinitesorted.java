package binarySearch;

public class infinitesorted {
    public static void main(String[] args) {
        int[] ar = {2,4,5,7,9,11,40,50,67,78,89,90};
        int tar = 11;
        System.out.println(findans(ar, tar));


    }
    public static int findans(int[] ar, int tar){
        int start = 0;
        int end = 1;
        while (tar > ar[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(ar, tar, start, end);
    }
    public static int binarySearch(int[] ar, int tar, int start, int end){
        while(start <= end) {
           
            int mid = start + (end - start) / 2;

            if (tar < ar[mid]) {
                end = mid - 1;
            } else if (tar > ar[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }


}
