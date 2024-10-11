package example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String newLine = sc.nextLine();
        int y = Integer.parseInt(sc.nextLine());

        System.out.printf("%d, %s, %d\n", x, newLine, y);

        sc.close();
    }
}
