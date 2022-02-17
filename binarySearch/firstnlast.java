package binarySearch;

public class firstnlast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        
       searchRange(nums, target);
        

    }
    public static int[] searchRange(int[] nums, int target){
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans[0]=i;
                break;
            }
        }
        System.out.print(ans[0]);
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                ans[1]=j;
            }
        }
        System.out.print(ans[0]);
        return ans;

    }

}
