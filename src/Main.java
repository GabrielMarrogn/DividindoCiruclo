import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long a = (n * (n - 1) * (n - 2) * (n - 3)) / 24;
        long b = (n * (n - 1)) / 2;

        long c = 1 + a + b;

        System.out.println(c);
        sc.close();
    }
}
