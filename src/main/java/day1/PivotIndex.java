package day1;

/*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.*/

public class PivotIndex {
	public static int pivotIndex(int[] nums) {
        int lsum=0;
        int rsum;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        if(sum-nums[0]==0)
            return 0;
        for(int i=1;i<nums.length;i++){
            lsum=lsum+nums[i-1];
            rsum=sum-lsum-nums[i];
            if(lsum==rsum)
                return i;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int p1;
		int nums[]= {1,2,3,4,5,1};
		p1=pivotIndex(nums);
		System.out.print(p1);
	}
}
