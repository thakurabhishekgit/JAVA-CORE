package TUF;

public class StriverSheetCodes {

    public static int maxProduct(int[] nums) {
        int pre = 1 , suf = 1;
        int maxP = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i ++ ) {
            if (pre == 0) {
                pre = 1;
            }
            if (suf == 0) {
                suf = 1;
            }
            pre *= nums[i];
            suf *= nums[nums.length - i - 1];

            maxP = Math.max(maxP, Math.max(pre, suf));


        }

        return maxP;

    }
    public static void main(String[] args) {
        int nums[] = { 2,3,-2,4};
        System.out.println(maxProduct((nums)));
        //a

    }
}
