import java.util.*;

class sum {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("x?");
        x = sc.nextInt();
        if (x < 10) {
            System.out.println("x = a");
        } else if (x < 20) {
            System.out.println("x=b");
        } else {
            System.out.println("x=c");
        }
    }
}
