import java.util.*;

class co {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x-axis value");
        int x = sc.nextInt();
        System.out.println("y-axis value");
        int y = sc.nextInt();
        String cordinate = "1st";
        if (x > 0)
            if (y < 0) {
                cordinate = "4th";
            }
        if (x < 0)
            if (y < 0) {
                cordinate = "3rd";
            }
        if (x < 0)
            if (y > 0) {
                cordinate = "2nd";
            }
        if (x > 0)
            if (y > 0) {
                cordinate = "1st";
            }
        if (x == 0)
            if (y == 0) {
                cordinate = "origin";
            }
        ;
        System.out.println("co-ordinate = " + cordinate);
    }
}