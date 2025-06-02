import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mathe {

    // 1. Count numbers divisible by x but not y
    public static int countDivisible(int l, int r, int x, int y) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (i % x == 0 && i % y != 0)
                count++;
        }
        return count;
    }

    // 2. Sum of digits until one digit
    public static int sumUntilOneDigit(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    // 3. Find all pairs with given difference k
    public static int countPairsWithDiff(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : arr) {
            if (set.contains(num - k))
                count++;
            if (set.contains(num + k))
                count++;
            set.add(num);
        }
        return count;
    }

    // 4. Count primes in a range [L, R]
    public static int countPrimesInRange(int L, int R) {
        boolean[] isPrime = new boolean[R + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= R; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= R; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime[i])
                count++;
        }
        return count;
    }

    // 5. Product of array except self
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++)
            left[i] = left[i - 1] * nums[i - 1];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)
            right[i] = right[i + 1] * nums[i + 1];
        for (int i = 0; i < n; i++)
            result[i] = left[i] * right[i];
        return result;
    }

    // 6. Find all missing numbers in range 1 to n
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        return result;
    }

    // 7. Find single element using XOR
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums)
            result ^= num;
        return result;
    }

    // 8. Count even and odd digits
    public static int[] countEvenOddDigits(int n) {
        int even = 0, odd = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0)
                even++;
            else
                odd++;
            n /= 10;
        }
        return new int[] { even, odd };
    }

    // 9. Check power of 2 or 3
    public static boolean isPowerOf2or3(int n) {
        while (n > 1) {
            if (n % 2 == 0)
                n /= 2;
            else if (n % 3 == 0)
                n /= 3;
            else
                return false;
        }
        return n == 1;
    }

    // 10. Check Armstrong number
    public static boolean isArmstrong(int n) {
        int temp = n, sum = 0, len = String.valueOf(n).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, len);
            temp /= 10;
        }
        return sum == n;
    }

    // 11. Count numbers with digit sum = target in range [l, r]
    public static int countWithDigitSum(int l, int r, int target) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            int sum = 0, num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum == target)
                count++;
        }
        return count;
    }

    // 12. GCD of array
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int findGCD(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    // 13. Find all palindrome numbers in range
    public static List<Integer> palindromesInRange(int l, int r) {
        List<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (isPalindrome(i))
                result.add(i);
        }
        return result;
    }

    public static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        System.out.println(countDivisible(1, 10, 2, 3));
        System.out.println(sumUntilOneDigit(987));
        System.out.println(countPairsWithDiff(new int[] { 1, 5, 3, 4, 2 }, 2));
        System.out.println(countPrimesInRange(10, 30));
        System.out.println(Arrays.toString(productExceptSelf(new int[] { 1, 2, 3, 4 })));
        System.out.println(findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 }));
        System.out.println(singleNumber(new int[] { 4, 1, 2, 1, 2 }));
        System.out.println(Arrays.toString(countEvenOddDigits(12345)));
        System.out.println(isPowerOf2or3(8));
        System.out.println(isArmstrong(153));
        System.out.println(countWithDigitSum(1, 100, 5));
        System.out.println(findGCD(new int[] { 12, 15, 21 }));
        System.out.println(palindromesInRange(1, 100));
    }

}
