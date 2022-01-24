class Solution {
	int getIdenticalTwinsCount (int[] arr) {
		int count = 0;
        for(int i =0;i<arr.length;i++){
            int start = arr[i];
            for(int j = i+1;j<arr.length;j++){
                if(start == arr[j]){
                    count++;
                }
            }

        }
		return count;
	}
}
