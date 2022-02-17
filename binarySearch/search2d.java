package binarySearch;

public class search2d {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7,9},{10,20,25,29,34},{38,40,44,49,53},{60,61,65,68,75},{78,80,85,90,95}};
        int tar = 75;
        boolean answer = search(arr, tar);
        System.out.println(answer);
        
    }
    public static boolean search(int[][] arr, int tar){
        int r = findRow(arr, tar);
        if(r== -1){
            return false;
        }
        boolean ans = findans(arr, r, tar);
        return ans;
    }
    
    public static int findRow(int[][] arr, int tar){
        int start = 0;
        int end = arr.length-1;
        int lc = arr[0].length-1; //finding length of the row
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid][0]<=tar && arr[mid][lc]>= tar){
                return mid;
            }else if(arr[mid][0]>tar){
                end = mid-1;
            }else if(arr[mid][0]<tar){
                start = mid+1;
            }
        }
        return -1;
    }
    public static boolean findans(int[][]arr,int r, int tar){
        int start = 0;
        int end = arr[0].length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[r][mid]==tar){
                return true;
            }else if(arr[r][mid]>tar){
                end = mid-1;
            }else if(arr[r][mid]<tar){
                start = mid+1;
            }
        }
        return false;
    }
}
