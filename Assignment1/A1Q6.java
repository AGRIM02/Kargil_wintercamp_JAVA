import java.util.Scanner;

public class A1Q6 {
    static String substr(String s, int st, int ed) {
        return s.substring(st, ed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int st = sc.nextInt();
        int ed = sc.nextInt();

        System.out.println(substr(s, st, ed));
    }
}
