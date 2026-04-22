
public class LC_45_1_JumpGameRec {
	
	public static int jump(int nums[], int i, int jumps, int currEnd, int farthest) {
		if(i>=nums.length-1) return jumps;
		
		farthest = Math.max(farthest, i+nums[i]);
		
		if(currEnd == i) {
			return jump(nums, i+1, jumps+1, farthest, farthest);
		}
		
		return jump(nums, i+1, jumps, currEnd, farthest);
	}
	
	public static int jumpRec(int nums[]) {
		if(nums.length == 1) return 0;
		
		return jump(nums, 0, 0, 0, 0);
	}

	public static void main(String[] args) {
		int nums[] = {2, 1, 3, 1, 1, 2, 4};
		
		System.out.println("Minimum Jumps: "+jumpRec(nums));
	}

}
