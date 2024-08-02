import java.util.*;

class even {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("a?");
        a = sc.nextInt();
        b = a % 2;
        if (b == 0) {
            System.out.println("its a even number");
        } else {
            System.out.println("its a odd number");
        }
    }
}
