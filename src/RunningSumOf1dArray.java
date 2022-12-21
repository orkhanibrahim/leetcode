import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
    }
    public static int [] runningSum(int[] nums) {
        int [] resultSum = new int[nums.length];
        for(int i = 0; i<nums.length; i++) {
            if(i==0){
                resultSum[i] = nums[i];
            }
            else{
                resultSum[i] = nums[i]+resultSum[i-1];
            }

        }
        return resultSum;
    }
}
