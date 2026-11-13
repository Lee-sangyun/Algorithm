package sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        // 버블정렬 구현
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) { // 아직 정렬되지 않은 배열 영역
                if (a[j] > a[j+1]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
