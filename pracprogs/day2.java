import java.util.*;

class day2 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("a?");
        a = sc.nextInt();
        if (a < 8) {
            b = a;
        } else {
            b = a % 7;

        }
        switch (b) {
            case 0:
                System.out.println("invalid");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }
    }
}