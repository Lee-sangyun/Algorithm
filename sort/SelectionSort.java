package sort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            int max = a[i];
            for (int j = i; j < a.length-1; j++) {
                if (max < a[j+1]) {
                    current = j+1;
                    max = a[j+1];
                }
            }
            if (a[i] < max) {
                int temp = a[i];
                a[i] = a[current];
                a[current] = temp;
            } // index 와 값을 따로 두지말고 index만 둬도 좋을듯!
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
