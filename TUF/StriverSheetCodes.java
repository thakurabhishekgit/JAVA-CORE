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

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0 ; i < strs[0].length() ; i ++ ) {
            for (int j = 0; j < strs.length - 1; j ++ ) {
                if( strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    count += 1;
                    break;
                }
            }
        }

        return count;

    }

    public static int minDeletionSize2(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        char[][] a = new char[n][];
        for (int i = 0; i < n; i++) {
            a[i] = strs[i].toCharArray();
        }
        boolean[] resolved = new boolean[n - 1];
        int unresolved = n - 1;

        int deletions = 0;

        for (int col = 0; col < m && unresolved > 0; col++) {
            boolean needDelete = false;

            for (int row = 0; row < n - 1; row++) {
                if (!resolved[row] && a[row][col] > a[row + 1][col]) {
                    needDelete = true;
                    break;
                }
            }

            if (needDelete) {
                deletions++;
                continue;
            }

            for (int row = 0; row < n - 1; row++) {
                if (!resolved[row] && a[row][col] < a[row + 1][col]) {
                    resolved[row] = true;
                    unresolved--;
                }
            }
        }

        return deletions;
    }
    public static void main(String[] args) {
//        int nums[] = { 2,3,-2,4};
//        System.out.println(maxProduct((nums)));
        //a
        String[] strs = {"abc", "bce", "cae"};
        System.out.println(minDeletionSize(strs));
        System.out.println(minDeletionSize2(strs));

    }
}
