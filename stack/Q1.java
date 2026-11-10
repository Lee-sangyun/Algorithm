package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(bf.readLine());
        }
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        boolean result = true;
        int num = 1;
        for (int i = 0; i < n; i++) {
            int su = a[i];
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                int s = stack.pop();
                if (s > su) {
                    System.out.println("No");
                    result = false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }
        }
        if (result == true) {
            System.out.println(sb.toString());
        }
    }
}
