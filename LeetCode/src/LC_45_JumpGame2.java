public class LC_45_JumpGame2 {

	public static int jump(int nums[]) {
		int n = nums.length;
		if(n == 1) return 0;
		
		int currEnd = 0, jumps = 0, farthest = 0;
		
		for(int i=0; i<n-1; i++) {
			farthest = Math.max(farthest, i+nums[i]);
			
			if(i == currEnd) {
				jumps++;
				currEnd = farthest;
				
				if(currEnd >= n-1) break;
			}
		}
		
		return jumps;
	}
	
	public static void main(String[] args) {
		int nums[] = {2, 1, 3, 1, 1, 2, 4};
	
		System.out.println("Minimum Jumps: "+jump(nums));
	}

}
