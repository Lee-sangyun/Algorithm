package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        // 우선순위 큐 구현 (절댓값이 작고, 만약 절댓값이 같다면 더 작은 수가 우선순위가 높음.)
        PriorityQueue<Integer> q = new PriorityQueue<>((o1,o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs;
        });
        for (int i = 0; i < n; i++) {
            int request = Integer.parseInt(bf.readLine());
            if (request == 0) {
                if(q.isEmpty()) System.out.println("0");
                else {
                    System.out.println(q.poll());
                }
            }
            else {
                q.add(request);
            }

        }
    }
}
