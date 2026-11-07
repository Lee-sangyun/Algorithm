package array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N+1];
        int S[] = new int[N+1];
        for (int i = 1; i<=N;i++) {
            A[i] = sc.nextInt();
        }
        // 합 배열 만들기
        S[1] = A[1];
        for (int i = 2; i <= N; i++) {
            S[i] = S[i-1] + A[i];
        }
        for (int i = 0; i<M;i++) {
            int k = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(S[j] - S[k-1]);
        }
    }
}
