class Solution {
	List<Integer> getPositiveCumulativeSum (int[] arr) {

		int[] ans = new int[arr.length];
    ans[0] = arr[0];
    for (int i = 1; i < arr.length; i++)
        ans[i] = ans[i-1] + arr[i];
    List<Integer> list = new ArrayList<>();
		for(int j: ans){
			if(j>0){
				list.add(j);
			}
		}
		return list;

        
	}
}
