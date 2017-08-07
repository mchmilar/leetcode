package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] a) {
        int maxHeight = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == maxHeight) {
                count++;
            } else if (a[i] > maxHeight) {
                maxHeight = a[i];
                count = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
