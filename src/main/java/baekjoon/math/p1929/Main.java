package baekjoon.math.p1929;

import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        br.close();

        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        int[] list = new int[end + 1];
        // 0 과 1 제외
        list[0] = 1;
        list[1] = 1;

        // end 의 루트 값 이하까지의 배수만 지워도 됨
        int sqrt = (int) Math.sqrt(end);

        for (int i = 2; i <= sqrt; i++) {
            if (list[i] == 0) {
                for (int j = 2; i * j <= end; j++) {
                    // i의 배수 삭제
                    list[i * j] = 1;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = start; i <= end; i++) {
            if (list[i] == 0) {
                bw.write(i + "\n");
            }
        }
        bw.close();
    }
}