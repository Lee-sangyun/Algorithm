package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    static int myArr[];
    static int check[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int result = 0;

        check = new int[4]; // 비밀번호 체크 배열
        char a[] = new char[s]; // 전체 문자열
        myArr = new int[s];
        checkSecret = 0; // 몇개를 충족시켰는가? 4가 되면 result++ 해주면 된다.

        a = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
            if (check[i] == 0) {
                checkSecret++; // 없어도 상관 없음.
            }
        }
        for (int i = 0; i < p; i++) { // 문자열 처음 받을 때 세팅
            Add(a[i]);
        }

        if (checkSecret == 4) result++; // 처음 들어오자마자 만족할 수도 있으므로.

        // 슬라이딩 윈도우
        for (int i = p; i < s; i++) {
            int j = i - p; // 즉 j가 가장 왼쪽, p가 가장 오른쪽 (부분 문자열에서)
            Add(a[i]);
            Remove(a[j]);
            if (checkSecret == 4) result++;
        }
        System.out.println(result);
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == check[0]) {
                    checkSecret--;
                    myArr[0]--;
                    break;
                }
            case 'C':
                if (myArr[1] == check[1]) {
                    checkSecret--;
                    myArr[1]--;
                    break;
                }
            case 'G':
                if (myArr[2] == check[2]) {
                    checkSecret--;
                    myArr[2]--;
                    break;
                }
            case 'T':
                if (myArr[3] == check[3]) {
                    checkSecret--;
                    myArr[3]--;
                    break;
                }
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == check[0]) {
                    checkSecret++;
                    break;
                }
            case 'C':
                myArr[1]++;
                if (myArr[1] == check[1]) {
                    checkSecret++;
                    break;
                }
            case 'G':
                myArr[2]++;
                if (myArr[2] == check[2]) {
                    checkSecret++;
                    break;
                }
            case 'T':
                myArr[3]++;
                if (myArr[3] == check[3]) {
                    checkSecret++;
                    break;
                }
        }
    }
}
