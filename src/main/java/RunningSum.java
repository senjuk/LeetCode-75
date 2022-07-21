
public class RunningSum {

	public static int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] rSum=new int[n];
        rSum[0]=nums[0];
        for(int i=1;i<n;i++){
            rSum[i]=rSum[i-1]+nums[i];
        }
        return rSum;
    }
	
	public static void main(String[] args) {
		int rsum[];
		int nums[]= {1,2,3,4,5};
		rsum=runningSum(nums);
		
		for(int i=0;i<rsum.length;i++) {
			System.out.print(rsum[i]+" ");
		}
	}
}
