import java.util.*;

class big {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e = Integer.MIN_VALUE;
        System.out.println("a?");
        a = sc.nextInt();
        System.out.println("B?");
        b = sc.nextInt();
        System.out.println("c?");
        c = sc.nextInt();
        System.out.println("d?");
        d = sc.nextInt();
        if (e < a) {
            e = a;
        }
        if (e < b) {
            e = b;
        }
        if (e < c) {
            e = c;
        }
        if (e < d) {
            e = d;
        }
        System.out.println("value = " + e);
    }
}