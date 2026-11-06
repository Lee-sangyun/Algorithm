package array;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();
        char cNum[] = sNum.toCharArray(); // 스트링 요소들을 배열로 전환시켜줌
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
