package baekjoon.n11720;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += (input.charAt(i) - '0');
        }

        System.out.println(sum);
    }
}
