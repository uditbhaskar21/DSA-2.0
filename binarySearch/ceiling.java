package binarySearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int tar = 4;
        int answer = find(arr, tar);
        System.out.println(answer);

    }
    public static int find(int[]arr, int tar){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==tar){
                return mid;
            }else if(arr[mid]<tar){
                
                start = mid+1;
                
            }else{
                end = mid-1;
            }

        }
        return arr[start];
    }
}
